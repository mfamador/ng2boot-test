package com.github.mfamador.ng2boot;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/api/hello")
    public String greet() {
	return "Hello from the other side!!!";
    }
}
    
