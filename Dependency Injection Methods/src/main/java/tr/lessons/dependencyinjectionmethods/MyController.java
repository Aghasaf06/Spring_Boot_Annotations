package tr.lessons.dependencyinjectionmethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    /*
    Dependency Injection Methods

        Field Injection
        Setter Injection
        Constructor Injection
     */

    //  Field Injection
    @Autowired
    private FirstClass firstClass;


    private SecondClass secondClass;

    //  Setter Injection
    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }


    private ThirdClass thirdClass;

    //  Constructor Injection
    public MyController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }


    @GetMapping(path = "/names")
    public String getNameOfClasses() {
        return firstClass.getName() + " --- "
                + secondClass.getName() + " --- "
                + thirdClass.getName();
    }
}