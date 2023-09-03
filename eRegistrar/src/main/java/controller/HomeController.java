package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/","/eregistrar", "/eregistrar/home"})
     public String displayHomePage(){
         return "index";
     }
}
