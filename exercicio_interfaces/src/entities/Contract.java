package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private final Integer NUMBER;
    private LocalDate date;
    private Double totalValue;
    private ArrayList<Installment> installmentArrayList = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.NUMBER = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNUMBER() {
        return NUMBER;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public ArrayList<Installment> getInstallmentArrayList() {
        return installmentArrayList;
    }
}
