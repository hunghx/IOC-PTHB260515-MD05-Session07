package ra.edu.orderservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @KafkaListener(
            topics = "order-created",
            groupId = "order-service-group"
    )
    public void handleMessageAfterOrderCreated(OrderRequest order) {
        System.out.println("Consumer bắt đầu xử lý ....");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Thời gian tạo : " + order.getCreatedAt());
        System.out.println("Tổng tiền : "+order.getTotalAmount());
        System.out.println("Kết thúc xử lý !");

    }
}
