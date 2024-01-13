public class BrazilInterestService implements InterestService {

    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
