package com.anas.demojavastack.Services;


import com.anas.demojavastack.Models.Task;
import com.anas.demojavastack.Models.User;
import com.anas.demojavastack.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskServices {

    @Autowired
    TaskRepository taskRepo;


    public void saveTask(Task task){
        taskRepo.save(task);
    }

    public List<Task> getAllTasks(User user){
        if (taskRepo.findAllByUser(user) == null){
            return new ArrayList<>();
        }
        return taskRepo.findAllByUser(user);
    }

    public List<Task> getAllTasksareImportent(User user){
        return taskRepo.findAllByImportantTrue(user);
    }

    public Task getTaskById(Long id){
        Optional<Task> task = taskRepo.findById(id);
        if (task.isPresent()){
            return task.get();
        }
        else {
            return null;
        }
    }


    public void DeleteTaskById(Long id){
        taskRepo.deleteById(id);
    }

    public void getAllTasksThatAreDone(User user){
        Date date = new Date();
        List<Task> tasks =  taskRepo.findAllByUserAndDueDateLessThan(user, date);
        for (Task task : tasks){
                task.setDone(true);
                task.setInProgress(false);
                taskRepo.save(task);
        }
    }

    public  List<Task> getAllTaskDone(User user){
        return taskRepo.findAllByDoneTrue(user);
    }

    public List<Task> getAllTasksInprogress(User user){
        return taskRepo.findAllByInProgressTrue(user);
    }
}
