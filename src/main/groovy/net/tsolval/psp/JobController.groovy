package net.tsolval.psp

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JobController {
   @RequestMapping("/")
   public String index() {
      return "Greetings from Spring Boot!"
   }
}
