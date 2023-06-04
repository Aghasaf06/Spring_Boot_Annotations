package tr.lesson.scopeannotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype")
//@RequestScope
//@SessionScope
public class MyComponent {

    public MyComponent() {
        System.out.println("My Component created: " + LocalDateTime.now());
    }

    public String getName() {
        return "My Component";
    }
}
