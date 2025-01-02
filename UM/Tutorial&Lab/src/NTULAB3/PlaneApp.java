package NTULAB3;

import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("(1) Show the number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of customers together with their seat numbers in the order of the seat numbers");
        System.out.println("(4) Show the list of customers together with their seat numbers in the order of the customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit\n");
        int choice;
        do {
            System.out.println("\n");
            System.out.print("    Enter the number of your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;

                case 2:
                    plane.showEmptySeats();
                    break;

                case 3:
                    plane.showAssignedSeat(true);
                    break;

                case 4:
                    plane.showAssignedSeat(false);
                    break;

                case 5:
                    System.out.println("Assigining Seat ..");
                    System.out.print("  Please enter SeatID:");
                    int seatID = sc.nextInt();
                    if (seatID < 0 || seatID > 12) {
                        System.out.println("Invalid seat id");
                        break;
                    }
                    System.out.print("  Please enter Customer ID:");
                    int customerID = sc.nextInt();
                    plane.assignSeat(seatID, customerID);
                    break;

                case 6:
                    System.out.print("Enter the seatID to remove:");
                    int seat = sc.nextInt();
                    if (seat < 0 || seat > 12) {
                        System.out.println("Invalid seat id");
                        break;
                    }
                    plane.unAssignSeat(seat);
                    break;

                case 7:
                    System.out.println("Terminating the program...");
                    break;

                default:
                    System.out.println("Invalid option,try again");
            }
        } while (choice != 7);
        sc.close();
    }
}
