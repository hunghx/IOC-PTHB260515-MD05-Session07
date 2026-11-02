package ra.edu.orderservice.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderProducer {
    private final KafkaTemplate<String, OrderRequest> kafkaTemplate;

    public void sendOrderCreated() {
        System.out.println("Kafka Producer bắt đầu gửi event");
        UUID  orderId = UUID.randomUUID();
        OrderRequest request = new OrderRequest(orderId.toString(), LocalDateTime.now(), BigDecimal.valueOf(100.0));
        kafkaTemplate.send("order-created", orderId.toString(), request);
        System.out.println("Tiếp tục thực hiện tác vụ tiếp theo");
    }

}
