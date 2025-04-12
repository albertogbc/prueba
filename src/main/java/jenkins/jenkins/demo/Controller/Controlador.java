package jenkins.jenkins.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controlador {
    
    @GetMapping("")
    public String getMethodName() {
        return new String("Hola mundo!");
    }
    
}
