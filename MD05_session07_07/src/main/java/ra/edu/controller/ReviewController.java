package ra.edu.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.edu.model.entity.UserCheck;

@Controller
@RequestMapping(value = {"/","ReviewController"})
public class ReviewController {

    @GetMapping
    public String review(Model model) {
        UserCheck userCheck = new UserCheck();
        model.addAttribute("UserCheck",userCheck);
        return "rateForm";
    }

    @PostMapping("/ReviewForm")
    public String check(@Valid @ModelAttribute("UserCheck") UserCheck userCheck, BindingResult bindingResult , Model model) {
       if(bindingResult.hasErrors()){

           model.addAttribute("message","validation error");
           return "rateForm";
       }


       return "ReviewConfirm";

    }
}
