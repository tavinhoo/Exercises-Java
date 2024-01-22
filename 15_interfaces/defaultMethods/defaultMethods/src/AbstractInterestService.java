public abstract class AbstractInterestService {

    public Double interestRate;

    public AbstractInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
