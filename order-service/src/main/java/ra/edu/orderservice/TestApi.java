package ra.edu.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestApi {
    @Value("${app.username:abc}")
    private String username;

    @GetMapping("/info")
    public String info() {
        return "Hello World: "+username;
    }

}
