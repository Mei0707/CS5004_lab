import java.util.Scanner;

public class ElevatorSystemUI {
    private ElevatorSystem elevatorSystem;
    private Scanner scanner;

    public ElevatorSystemUI(ElevatorSystem elevatorSystem) {
        this.elevatorSystem = elevatorSystem;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Elevator System!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Call Elevator");
            System.out.println("2. Enter Elevator");
            System.out.println("3. Exit Elevator");
            System.out.println("4. Exit System");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    callElevator();
                    break;
                case 2:
                    enterElevator();
                    break;
                case 3:
                    exitElevator();
                    break;
                case 4:
                    System.out.println("Thank you for using the Elevator System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void callElevator() {
        System.out.println("Which floor are you on?");
        int currentFloor = scanner.nextInt();

        System.out.println("Which floor do you want to go to?");
        int destinationFloor = scanner.nextInt();

        // Add request to the nearest elevator cab
        ElevatorCab nearestCab = findNearestCab(currentFloor);
        nearestCab.addExternalRequest(destinationFloor);

        System.out.println("Elevator called to floor " + currentFloor + ". Please wait for the elevator.");
        // In a real system, you would simulate the movement of the elevator and notify the user when it arrives
    }

    private void enterElevator() {
        System.out.println("Please wait for the elevator to arrive.");
        // In a real system, you would wait for the elevator to arrive and notify the user

        System.out.println("Elevator has arrived. You can now enter.");
        // In a real system, you would provide a way for the user to confirm they've entered the elevator

        System.out.println("Elevator door is closing...");
        // In a real system, you would close the elevator door

        System.out.println("Elevator door is closed.");
    }

    private void exitElevator() {
        System.out.println("Exiting elevator...");
        // In a real system, you would provide a way for the user to confirm they've exited the elevator

        System.out.println("Elevator door is opening...");
        // In a real system, you would open the elevator door

        System.out.println("Elevator door is open. You can now exit.");
    }

    private ElevatorCab findNearestCab(int currentFloor) {
        ElevatorCab nearestCab = null;
        int minDistance = Integer.MAX_VALUE;

        for (ElevatorCab cab : elevatorSystem.getElevatorCabs()) {
            int distance = Math.abs(cab.getCurrentFloor() - currentFloor);
            if (distance < minDistance) {
                minDistance = distance;
                nearestCab = cab;
            }
        }

        return nearestCab;
    }

    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = new ElevatorSystem(4);
        ElevatorSystemUI ui = new ElevatorSystemUI(elevatorSystem);
        ui.start();
    }
}
