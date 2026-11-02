package ra.edu.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableKafka
@SpringBootApplication
@EnableScheduling
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(OrderProducer producer){
//        return args -> {
//            System.out.println("Order Service is running...");
//            producer.sendOrderCreated();
//        };
//    }

    // Bài toán: sau mỗi 5s sẽ in ra dòng xin chao các bạn
    @Scheduled(fixedRate = 5000)
    public void printHello(){
        System.out.println("Xin chào các bạn");
    }

}
