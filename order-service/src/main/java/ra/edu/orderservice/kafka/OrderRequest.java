package ra.edu.orderservice.kafka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderRequest {
    private String orderId;
    private LocalDateTime createdAt;
    private BigDecimal totalAmount;
}
