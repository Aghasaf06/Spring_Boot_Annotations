package tr.lessons.dependencyinjectionmethods;

import org.springframework.stereotype.Component;

@Component
public class SecondClass {

    public String getName() {
        return getClass().getName();
    }
}
