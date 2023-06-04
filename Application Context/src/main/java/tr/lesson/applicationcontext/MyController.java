package tr.lesson.applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/application-context")
public class MyController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping(path = "/names")
    public void example1() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @GetMapping(path = "/count")
    public void example2() {
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();

        System.out.println(beanDefinitionCount);
    }

    @GetMapping(path = "/getBean")
    public void example3() {
        MyComponent myComponent = (MyComponent) applicationContext.getBean("myComponent");
        //MyComponent myComponent = (MyComponent) applicationContext.getBean(MyComponent.class);

        System.out.println(myComponent.getName());
    }

    @GetMapping(path = "/getType")
    public void example4() {
        Class<?> myComponent = applicationContext.getType("myComponent");

        System.out.println(myComponent);
        System.out.println(myComponent.getSimpleName());
    }

    @GetMapping(path = "/containsBean")
    public void example5() {
        boolean myComponent = applicationContext.containsBean("myComponent");
        boolean myController = applicationContext.containsBean("myController");
        boolean myConfiguration = applicationContext.containsBean("myConfiguration");

        System.out.println(myComponent);
        System.out.println(myController);
        System.out.println(myConfiguration);
    }
}
