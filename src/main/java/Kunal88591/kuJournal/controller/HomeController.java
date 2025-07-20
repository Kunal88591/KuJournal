package Kunal88591.kuJournal.controller;

import Kunal88591.kuJournal.Entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {

    private Map < Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Collections.singletonMap("status", "UP");
    }

    @GetMapping("/about")
    public Map<String, String> about() {
        return Collections.singletonMap("info", "kuJournal is a Spring Boot project by Kunal ");
    }

    @GetMapping("/contact")
    public Map<String, String> contact() {
        Map<String, String> contactInfo = new HashMap<>();
        contactInfo.put("email", "kunalofficial8859@gmail.com");
        contactInfo.put("phone", "+91-6261629737");
        return contactInfo;
    }
}
