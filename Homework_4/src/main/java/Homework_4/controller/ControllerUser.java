package Homework_4.controller;

    import Homework_4.service.ServiceUser;
    import Homework_4.users.User;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

@Controller
public class ControllerUser {

    private ServiceUser serviceUser;

    @Autowired
    public ControllerUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @GetMapping("/user")
    public String findAllUsers(Model model){
        model.addAttribute("list", String.valueOf(serviceUser.findAllUsers()));
        return "users.html";
    }

    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable int id, Model model){
        model.addAttribute("user", String.valueOf(serviceUser.findUserById(id)));
        return "users.html";
    }

}
