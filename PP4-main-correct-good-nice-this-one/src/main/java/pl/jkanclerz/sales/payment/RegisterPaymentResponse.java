package pl.jkanclerz.sales.payment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterPaymentResponse {
    String id;
    String url;
}
