package johnson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC");
        System.out.println("进来了");

        return"helloworld";

    }

    @RequestMapping("/hello1")
    public String hello1(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC 1");
        System.out.println("进来了1");

        return"helloworld1";

    }

    @RequestMapping("/hello2")
    public String hello2(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC 1");
        System.out.println("进来了1");

        return"helloworld2";

    }
}
