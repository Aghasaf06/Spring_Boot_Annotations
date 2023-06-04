package tr.lesson.applicationcontext;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String getName() {
        return "My name is MyComponent!";
    }
}
