package model.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService() {
    }

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        for (int i = 1; i <= months; i++) {

            // Bloco manipulador de datas
            LocalDate receivedDate = contract.getDate();
            String nextDate = receivedDate.plusMonths(i).toString();

            LocalDate formattedDate = LocalDate.parse(nextDate);

            // Bloco manipulador dos valores
            Double initialPrice = contract.getTotalValue() / months;
            Double InterestValue = onlinePaymentService.interest(initialPrice, i);
            Double feeValue = onlinePaymentService.paymentFee(InterestValue + initialPrice);

            Double installmentFinalPrice = initialPrice + InterestValue + feeValue;

            contract.getListOfInstallments().add(new Installment(formattedDate, installmentFinalPrice));

        }
    }
}
