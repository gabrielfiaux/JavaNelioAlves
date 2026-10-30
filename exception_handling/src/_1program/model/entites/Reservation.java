package _1program.model.entites;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Reservation {
    private int roomNumber;
    private LocalDateTime checkin;
    private LocalDateTime checkout;

    public Reservation() {
    }

    public Reservation(int roomNumber, LocalDateTime checkin, LocalDateTime checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public Period periodOfCheckin() {
        LocalDate localDateCheckin = getCheckin().toLocalDate();
        LocalDate localDateCheckout = getCheckout().toLocalDate();
        Period period = Period.between(localDateCheckin, localDateCheckout);
        return periodOfCheckin();
    }

    public int[] timeDifference() {
        int days = periodOfCheckin().getDays();
        int months = periodOfCheckin().getMonths();
        int years = periodOfCheckin().getYears();
        int[] date = {days, months, years};
        return date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "Room " + roomNumber +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}
