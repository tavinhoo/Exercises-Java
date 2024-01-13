package model.services;

public class PaypalService implements OnlinePaymentService {

    public Double paymentFee(Double amount) {
        double fee = amount * 0.02;
        return fee;
    }

    public Double interest(Double amount, Integer months) {
        return amount * 0.01 * months;
    }
}
