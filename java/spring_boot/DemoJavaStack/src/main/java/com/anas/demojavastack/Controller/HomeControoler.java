package com.anas.demojavastack.Controller;


import com.anas.demojavastack.Models.Task;
import com.anas.demojavastack.Models.User;
import com.anas.demojavastack.Services.TaskServices;
import com.anas.demojavastack.Services.UserServices;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeControoler {

    @Autowired
    private UserServices userServ;

    @Autowired
    private TaskServices taskServ;


    @GetMapping("/home")
    public String homePage(Model model, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (model.getAttribute("User") == null){
            return "redirect:/";
        }
        taskServ.getAllTasksThatAreDone(user);
        model.addAttribute("tasks",taskServ.getAllTasksInprogress(user));
        return "home.jsp";
    }


    @GetMapping("/impo/{id}")
    public String impo(Model model, @PathVariable("id") Long id, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (model.getAttribute("User") == null){
            return "redirect:/";
        }
        Task task  = taskServ.getTaskById(id);
        boolean x = true;
        task.setImportant(x);
        taskServ.saveTask(task);
        return "redirect:/home";
    }





    @GetMapping("/addtask")
    public String newProject(@ModelAttribute("newproject") Task task , HttpSession session , Model model){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (model.getAttribute("User") == null){
            return "redirect:/";
        }
        return "/WEB-INF/newtask.jsp";
    }


    @PostMapping("/addTask")
    public String addTask(@Valid @ModelAttribute("newproject") Task task, BindingResult result, Model model, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (user == null){
            return "redirect:/";
        }
        if (result.hasErrors()){
            return "/WEB-INF/newtask.jsp";
        }
        taskServ.saveTask(task);
        return "redirect:/home";
    }


    @GetMapping("/edit/{id}")
    public String task(Model model,@ModelAttribute("newproject") Task task, @PathVariable("id") Long id, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (user == null){
            return "redirect:/";
        }
        if (taskServ.getTaskById(id) == null){
            return "redirect:/home";
        }
        model.addAttribute("newproject",taskServ.getTaskById(id));
        return "/WEB-INF/edittask.jsp";
    }

    @PostMapping("/editTask")
    public String editTask(@Valid @ModelAttribute("newproject") Task task, BindingResult result  , Model model , HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (result.hasErrors()){
            return "/WEB-INF/edittask.jsp";
        }
        else{
            task.setId(task.getId());
            taskServ.saveTask(task);
            return "redirect:/home";
        }
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, HttpSession session , Model model){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (user == null){
            return "redirect:/";
        }else{
             if (taskServ.getTaskById(id) == null){
                 return "redirect:/home";
             }
           taskServ.DeleteTaskById(id);
            return "redirect:/home";
        }
    }

    @GetMapping("/show/{id}")
    public String showTask(Model model, @PathVariable("id") Long id, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (user == null){
            return "redirect:/";
        }else{
            model.addAttribute("task",taskServ.getTaskById(id));
            return   "/WEB-INF/showTask.jsp";
        }
    }


    @GetMapping("/imortent")
    public String homeforImportentPage(Model model, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (model.getAttribute("User") == null){
            return "redirect:/";
        }
        model.addAttribute("tasks",taskServ.getAllTasksareImportent(user));
        return "home.jsp";
    }


    @GetMapping("/done")
    public String homeforDonePage(Model model, HttpSession session){
        User user = (User) session.getAttribute("User");
        model.addAttribute("User",user);
        if (model.getAttribute("User") == null){
            return "redirect:/";
        }
        model.addAttribute("tasks",taskServ.getAllTaskDone(user));
        return "home.jsp";
    }



//
//    @GetMapping("/leave/{id}")
//    public String leaveTeam(@PathVariable("id") Long id, HttpSession session, Model model) {
//        User sessionUser = (User) session.getAttribute("User");
//        model.addAttribute("User",sessionUser);
//        if (sessionUser == null) {
//            return "redirect:/";
//        }
//
//        // Get fresh user from DB
//        User user = userServ.getById(sessionUser.getId());
//        Project projectToRemove = projectServ.getProjectById(id);
//
//        for (Iterator<Project> iterator = user.getProjects().iterator(); iterator.hasNext(); ) {
//            Project p = iterator.next();
//            if (p.getId().equals(projectToRemove.getId())) {
//                iterator.remove();
//            }
//        }
//        userServ.saveUser(user);
//
//        return "redirect:/home";
//    }
//
//    @GetMapping("/join/{id}")
//    public String JoinTeam(@PathVariable("id") Long id ,HttpSession session, Model model){
//        User user = (User) session.getAttribute("User");
//        model.addAttribute("User",user);
//        if (user == null ){
//            return "redirect:/";
//        }
//        Project project = projectServ.getProjectById(id);
//        if (!user.getProjects().contains(project)){
//            user.getProjects().add(project);
//            userServ.saveUser(user);
//            return "redirect:/home";
//        }
//            return "redirect:/home";
//    }

//
//    @GetMapping("/edit/{id}")
//    public String EditPro(@PathVariable("id")Long id , @ModelAttribute("newproject") Project project , HttpSession session,Model model){
//        User user = (User) session.getAttribute("User");
//        model.addAttribute("User",user);
//        if (user == null ){
//            return "redirect:/";
//        }
//        model.addAttribute("newproject",projectServ.getProjectById(id));
//        return "/WEB-INF/edittask.jsp";
//    }


//    @PostMapping("/edit/{id}")
//    public String EditProject(@PathVariable("id")Long id ,@Valid @ModelAttribute("newproject") Project project ,BindingResult result, HttpSession session,Model model){
//        User user = (User) session.getAttribute("User");
//        model.addAttribute("User",user);
//        if (user == null ){
//            return "redirect:/";
//        }
//        model.addAttribute("newproject",projectServ.getProjectById(id));
//        if(result.hasErrors()){
//            return "/WEB-INF/edittask.jsp";
//        }
//        else {
//            project.setId(id);
//            projectServ.SaveProject(project);
//        }
//        return "redirect:/home";
//    }
}







