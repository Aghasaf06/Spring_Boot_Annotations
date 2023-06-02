package tr.lessons.dependencyinjectionmethods;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {

    public String getName() {
        return getClass().getName();
    }
}
