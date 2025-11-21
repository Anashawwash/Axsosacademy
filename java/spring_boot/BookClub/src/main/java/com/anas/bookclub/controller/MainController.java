package com.anas.bookclub.Controller;
import com.anas.bookclub.Models.Book;
import com.anas.bookclub.Models.LoginUser;
import com.anas.bookclub.Models.User;
import com.anas.bookclub.services.BookServices;
import com.anas.bookclub.services.UserServices;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    @Autowired
    private UserServices userServ;


    @Autowired
    private BookServices bookServ;


    @GetMapping("/")
    public String landing(@ModelAttribute("newUser") User user,
                          @ModelAttribute("loginUser") LoginUser loginUser) {
        return "Landing.jsp";
    }


    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("loginUser") LoginUser loginUser,
                          @Valid @ModelAttribute("newUser") User user, BindingResult result , HttpSession session) {
        if (result.hasErrors()) {
            return "Landing.jsp";
        } else {
            if (userServ.NewUserVal(result,user) != user){
                return "Landing.jsp";
            }
            else{
                session.setAttribute("User",user);
                return "redirect:/home";
            }
        }
    }


    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser,BindingResult x , @ModelAttribute("newUser") User user, HttpSession session ){
        if (x.hasErrors()) {
            return "Landing.jsp";
        } else {
            User newuser = userServ.LoginVal(x,loginUser);
            if(newuser == null){
                return "Landing.jsp";
            }
            else{
                session.setAttribute("User",newuser);
                return "redirect:/home";
            }
        }
    }


    @GetMapping("/home")
    public String homePage(Model model ,HttpSession session){
        model.addAttribute("User",session.getAttribute("User"));
        model.addAttribute("Books",bookServ.getAllBook());
        if (session.getAttribute("User") == null){
            return  "redirect:/";
        }
        return "Home.jsp";
    }

    @GetMapping("/logout")
    public String Logout(HttpSession session){
        session.removeAttribute("User");
        return "redirect:/";
    }


    @GetMapping("/addbook")
    public String Addbook(@ModelAttribute("newBook")Book book,Model model ,HttpSession session){
        model.addAttribute("User",session.getAttribute("User"));
        if (model.getAttribute("User") == null){
            return "redirect:/";
        }
        else{
            return "shelve.jsp";
        }

    }


    @PostMapping("/addBook")
    public String addBook(@Valid @ModelAttribute("newBook") Book book , BindingResult result , Model model, HttpSession session){
        if (result.hasErrors()){
            return "shelve.jsp";
        }
        else{
            bookServ.saveBook(book);
            return "redirect:/home";
        }
    }


    @GetMapping("/book/{id}")
    public String showBook(@PathVariable("id") Long id,Model model , HttpSession session){
        if (session.getAttribute("User") == null){
            return "redirect:/";
        }
        model.addAttribute("User",session.getAttribute("User"));
        model.addAttribute("book",bookServ.getBookById(id));
        return "/WEB-INF/show.jsp";

    }


    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id , HttpSession session ,Model model , RedirectAttributes redirectAttributes){
        User user  = (User)session.getAttribute("User");
        Book book = bookServ.getBookById(id);
        if (user == null){
            return "redirect:/";
        }else{
            if (user.getId() != book.getUser().getId()){
                redirectAttributes.addFlashAttribute("userE","you can't do this Action");
                return "redirect:/home";
            }
            else{
                bookServ.deleteBook(book);
                return "redirect:/home";
            }
        }
    }


    @GetMapping("/edit/{id}")
    public String editbook(@PathVariable("id") Long id, @ModelAttribute("book") Book book ,Model model , HttpSession session){
        model.addAttribute("book",bookServ.getBookById(id));
        model.addAttribute("User",session.getAttribute("User"));
        return "/WEB-INF/edit.jsp";
    }


    @PostMapping("/edit/{id}")
    public String EditBook(@Valid @ModelAttribute("book") Book book , BindingResult result ,Model model , HttpSession session){
        if (session.getAttribute("User")==null){
            return "redirect:/";
        }
        model.addAttribute("User",session.getAttribute("User"));
        if (result.hasErrors()){
            return "/WEB-INF/edit.jsp";
        }
        else{
            bookServ.saveBook(book);
            return "redirect:/home";
        }

    }

}