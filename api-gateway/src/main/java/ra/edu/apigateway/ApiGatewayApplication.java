package ra.edu.apigateway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(Test test, ModelConfig config){
        return args -> {
            System.out.println("Title : "+ test.getTitle());
            System.out.println("Description : "+ test.getDescription());
            System.out.println("Lang : "+ test.getLanguage());

            System.out.println("======================================");
            System.out.println("Title : "+ config.getTitle());
            System.out.println("Description : "+ config.getDescription());
            System.out.println("Lang : "+ config.getLanguage());
        };
    }

}
