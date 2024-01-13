public class UsaInterestService implements InterestService {

    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
