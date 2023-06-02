package tr.lesson.lazyanotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyComponent myComponent;

    public MyController(MyComponent myComponent) {
        this.myComponent = myComponent;
    }
}
