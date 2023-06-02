package tr.lesson.lazyannotation2;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyConfiguration myConfiguration;

    public MyController(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }

    /*
    private Example1 example1;

    public MyController(Example1 example1) {
        this.example1 = example1;
    }
     */
}
