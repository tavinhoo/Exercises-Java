public interface InterestService {

    double getInterestRate();

    default Double payment(Double amount, Integer months) {
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    }
}
