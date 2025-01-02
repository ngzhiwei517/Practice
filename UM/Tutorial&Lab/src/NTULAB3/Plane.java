package NTULAB3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeat;

    public Plane() {
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
        this.numEmptySeat = 12;
    }

    private PlaneSeat[] sortSeatsbyCustomerID() {
        ArrayList<PlaneSeat> sortSeat = new ArrayList<>(Arrays.asList(seat));
        Collections.sort(sortSeat, new sortByCustomerID());
        return sortSeat.toArray(new PlaneSeat[0]);
    }

    private PlaneSeat[] sortSeatBySeatID() {
        ArrayList<PlaneSeat> sortSeat = new ArrayList<>(Arrays.asList(seat));
        Collections.sort(sortSeat, new sortBySeatID());
        return sortSeat.toArray(new PlaneSeat[0]);
    }

    public void showNumEmptySeats() {
        System.out.printf("There are %d empty seats\n", numEmptySeat);
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (PlaneSeat seats : seat) {
            if (!seats.isOccupied()) {
                System.out.println("SeatID " + seats.getSeatID());
            }
        }
    }


    public void showAssignedSeat(boolean bySeatID) {
        System.out.println("The seat assignments are as follows:");
        PlaneSeat[] planeSeats = bySeatID ? sortSeatBySeatID() : sortSeatsbyCustomerID();
        for (PlaneSeat seat1 : planeSeats) {
            if (seat1.isOccupied()) {
                System.out.printf("Seat ID:%d assigned to Customer ID %d.\n", seat1.getSeatID(), seat1.getCustomerID());
            }
        }
    }


    public void assignSeat(int seatID, int cust_id) {
        if (seatID < 0 || seatID > 12) {
            System.out.println("Invalid seat id");
            return;
        }

        PlaneSeat targetSeat = seat[seatID - 1];
        if (!targetSeat.isOccupied()) {
            targetSeat.assign(cust_id);
            numEmptySeat--;
            System.out.printf("Seat Assigned!");
        } else {
            System.out.println("Seat already assigned to a customer\n");
        }
    }

    public void unAssignSeat(int seatID) {

        PlaneSeat targetSeat = seat[seatID - 1];
        if (targetSeat.isOccupied()) {
            targetSeat.unassign();
            numEmptySeat++;
            System.out.println("Seat Unassigned!");
        } else {
            System.out.println("Seat is already empty.\n");
        }
    }


}






