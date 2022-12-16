package behomeworkpreprojectgithubtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/") // 멋진 To-do Application 엔드포인트!
    public String helloWorld() {
        return "To-do Application !";
    }
}
