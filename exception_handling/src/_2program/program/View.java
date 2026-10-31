package _2program.program;

import _2program.entites.Account;
import _2program.exceptions.InsuficientBalanceException;
import _2program.exceptions.NoWithdrawLimitException;
import _2program.exceptions.WithdrawValueIsInvalid;

public class View {
    static void main(String[] args) {
        Account ac1 = new Account(1, "Gab", 100, 300.0);
        System.out.println(ac1);
        System.out.println("TEST DEPOSIT: 100");
        ac1.deposit(100);
        System.out.println(ac1);
        System.out.println("TEST WITHDRAW: 100");
        try {
            ac1.withdraw(300);

        } catch (WithdrawValueIsInvalid e) {
            System.out.println(e.getMessage());
        } catch (NoWithdrawLimitException e) {
            System.out.println(e.getMessage());
        } catch (InsuficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(ac1);
        System.out.println("end program");
    }
}
