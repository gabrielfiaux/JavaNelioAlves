package _1program.model.entites;

import java.time.Duration;
import java.time.LocalDateTime;

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

    public Duration duration(){
        Duration duration = Duration.between(getCheckin(), getCheckout());
        return duration;
    }
}
