package services;

import entites.Contract;
import entites.Installment;

import java.time.LocalDate;

public class ContractServices {
    private OnlinePaymentServices onlinePaymentServices;

    public ContractServices(OnlinePaymentServices onlinePaymentServices) {
        this.onlinePaymentServices = onlinePaymentServices;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentServices.interest(basicQuota, i);
            double fee = onlinePaymentServices.paymantFee(basicQuota + interest);
            double quoata = basicQuota + interest + fee;
            contract.getInstallmentArrayList().add(new Installment(dueDate, quoata));
        }
    }
}
