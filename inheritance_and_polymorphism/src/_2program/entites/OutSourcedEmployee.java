package _2program.entites;

public class OutSourcedEmployee extends Employee {
    private Double adicionalCharge;

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double adicionalCharge) {
        super(name, hours, valuePerHour);
        this.adicionalCharge = adicionalCharge;
    }

    public Double getAdicionalCharge() {
        return adicionalCharge;
    }

    public void setAdicionalCharge(Double adicionalCharge) {
        this.adicionalCharge = adicionalCharge;
    }

    @Override
    public double payment() {
        return salary() + getAdicionalCharge();
    }
}
