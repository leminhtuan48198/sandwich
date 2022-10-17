package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentsPick {
    @GetMapping("/pick")
    public String pickCondiments(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "result";
    }
    @GetMapping("/home")
    public  String showMenu(){
        return "menu";
    }
}
