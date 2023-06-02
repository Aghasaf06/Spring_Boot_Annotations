package tr.lessons.dependencyinjectionmethods;

import org.springframework.stereotype.Component;

@Component
public class ThirdClass {

    public String getName() {
        return getClass().getName();
    }
}
