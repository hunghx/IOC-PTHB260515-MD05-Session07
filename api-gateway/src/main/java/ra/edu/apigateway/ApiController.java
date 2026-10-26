package ra.edu.apigateway;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final ModelConfig test;
    @GetMapping
    public String getConfig(){
        return "Title : "+ test.getTitle() + "\n" +
                "Description : "+ test.getDescription() + "\n" +
                "Lang : "+ test.getLanguage();
    }
}
