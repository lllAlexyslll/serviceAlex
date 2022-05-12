package alexandr.mikhed.serviceAlex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/messages")
public class AlexRestController {
    private List<String> messages = Stream.of("Alex1", "Alex2", "Alex3").collect(Collectors.toList());

    @GetMapping
    public List<String> getAllMessages() {
        return messages;
    }
}
