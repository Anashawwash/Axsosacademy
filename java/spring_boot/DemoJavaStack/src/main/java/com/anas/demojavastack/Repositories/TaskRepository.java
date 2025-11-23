package com.anas.demojavastack.Repositories;


import com.anas.demojavastack.Models.Task;
import com.anas.demojavastack.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


    List<Task> findAllByUser(User user);

    List<Task> getTaskById(Long id);

    List<Task> findAllByImportantTrue(User user);

    List<Task> findAllByUserAndDueDateLessThan(User user, Date date);

    List<Task> findAllByDoneTrue(User user);

    List<Task> findAllByInProgressTrue(User user);

}
