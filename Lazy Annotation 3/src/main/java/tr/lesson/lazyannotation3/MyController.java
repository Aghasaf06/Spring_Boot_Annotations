package tr.lesson.lazyannotation3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    private MyComponent myComponent;

    public MyController(@Lazy MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    /*
    @Autowired
    @Lazy
    private MyComponent myComponent;
    */

    @GetMapping(path = "/name")
    public String getComponentName() {
        return myComponent.getName();
    }
}
