package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;
import model.services.Wise;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();

        System.out.print("""
                Plataformas de pagamento disponíveis:
                [1] - PAYPAL
                [2] - WISE
                Selecione uma opção: """);

        int selectedMethod = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number, date, contractValue);

        System.out.print("Entre com o numero de parcelas: ");
        int nParcelas = sc.nextInt();

        ContractService contractService;

        switch (selectedMethod) {
            case 1:
                contractService = new ContractService(new PaypalService());
                contractService.processContract(contract, nParcelas);
                break;
            case 2:
                contractService = new ContractService(new Wise());
                contractService.processContract(contract, nParcelas);
            default:
                break;
        }

        for (Installment installment : contract.getListOfInstallments()) {
            System.out.println(
                    installment.getDueDate().format(fmt) + " - R$" + String.format("%.2f", installment.getAmount()));
        }
        System.out.println("Valor total do contrato: R$ " + String.format("%.2f", contract.finalValue()));

    }
}
