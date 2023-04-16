package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/main")
    public String viewUser (ModelMap modelMap) {
        modelMap.addAttribute("listUsers", userService.listUsers());
        return "main";
    }
    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/main";
    }
    @PatchMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/main";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(@ModelAttribute("id") Long id) {
        userService.delete(id);
        return "redirect:/main";
    }

}
