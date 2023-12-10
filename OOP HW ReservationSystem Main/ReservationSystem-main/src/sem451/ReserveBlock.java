package sem451;

import java.io.Serializable;
import java.time.LocalDate;

public class ReserveBlock implements Serializable {
    Person by;
    LocalDate d;
    int clock;
    Room room;

    public ReserveBlock(Person p, LocalDate d, int clock, Room r) {
        by = p;
        try {
            // Validate and assign the date
            if (d == null) {
                throw new IllegalArgumentException("Invalid date");
            }
            this.d = d;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            // Validate and assign the clock
            if (clock < 1 || clock > 24) {
                throw new IllegalArgumentException("Invalid clock");
            }
            this.clock = clock;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.d = d;
        this.clock = clock;
        room = r;
    }

    public boolean equals(ReserveBlock br) {
        if (br.getClock() == this.getClock() && br.getDate() == this.getDate() && br.getRoom() == this.getRoom()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Session [" + room.name + ", " + d + ", at " + clock + ", by " + by + "]";
    }

    public Person getBy() {
        return by;
    }

    public void setBy(Person by) {
        this.by = by;
    }

    public LocalDate getDate() {
        return d;
    }

    public void setDate(LocalDate d) {
        this.d = d;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
