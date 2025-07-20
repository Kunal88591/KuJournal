package Kunal88591.kuJournal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Collections.singletonMap("message", "Welcome to kuJournal Home!");
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Collections.singletonMap("status", "UP");
    }

    @GetMapping("/about")
    public Map<String, String> about() {
        return Collections.singletonMap("info", "kuJournal is a Spring Boot demo project by Kunal ");
    }

    @GetMapping("/contact")
    public Map<String, String> contact() {
        Map<String, String> contactInfo = new HashMap<>();
        contactInfo.put("email", "kunalofficial8859@gmail.com");
        contactInfo.put("phone", "+91-6261629737");
        return contactInfo;
    }
}
