package model.services;

public class Wise implements OnlinePaymentService {

    public Double paymentFee(Double amount) {
        double fee = amount * 0.01;
        return fee;
    }

    public Double interest(Double amount, Integer months) {
        return amount * 0.015 * months;
    }
}
