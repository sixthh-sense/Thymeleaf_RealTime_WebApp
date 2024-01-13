package net.javaguides.thymeleaftutorial.controller;

import net.javaguides.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handler method to handle variable expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Hae-In", "jeranum8@gmail.com", "ADMIN", "Female");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // handler method to handle selection expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Hae-In", "jeranum8@gmail.com", "ADMIN", "Female");
        model.addAttribute("user", user);
        return "selection-expression";
    }
}
