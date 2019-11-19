package react.with.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 
@Controller
public class MyController {

    Logger logger = LoggerFactory.getLogger(MyController.class);
 
    @GetMapping("/react/{name}")
    public String page(@PathVariable String name, Model model) {

        logger.info("★"+name);
        
        model.addAttribute("pageName", name);
        return "page";
    }

    @GetMapping("/test")
    public String page() {

        return "test";
    }
 
}