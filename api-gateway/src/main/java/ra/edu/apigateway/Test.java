package ra.edu.apigateway;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Test {
    @Value("${app.title}")
    private String title;
    @Value("${app.description}")
    private String description;
    @Value("${app.language}")
    private String language;
}
