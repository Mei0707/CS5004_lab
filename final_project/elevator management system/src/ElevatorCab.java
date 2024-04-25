import java.util.ArrayList;
import java.util.List;

public class ElevatorCab {
    public List<Integer> getRequests() {
        return requests;
    }

    public void setRequests(List<Integer> requests) {
        this.requests = requests;
    }

    enum State { STOP, UP, DOWN }

    private State state;
    private Door door;
    private Alarm alarm;
    private int currentFloor;
    private List<Integer> requests;

    public ElevatorCab() {
        this.state = State.STOP;
        this.door = new Door();
        this.alarm = new Alarm();
        this.currentFloor = 0;
        this.requests = new ArrayList<>();
    }

    public void addExternalRequest(int floor) {
        requests.add(floor);
    }

    public void addInternalRequest(int floor) {
        requests.add(floor);
    }

    public void move() {
        while (!requests.isEmpty()) {
            int nextFloor = findNextFloor();
            System.out.println("Moving from floor " + currentFloor + " to floor " + nextFloor);
            setCurrentFloor(nextFloor);
            requests.remove((Integer) nextFloor);
        }
    }

    private int findNextFloor() {
        int closestFloor = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int floor : requests) {
            int distance = Math.abs(floor - currentFloor);
            if (distance < minDistance) {
                minDistance = distance;
                closestFloor = floor;
            }
        }
        return closestFloor;
    }

    // Scan algorithm to find the next floor to visit
    public int getNextFloorScan(ElevatorCab elevatorCab) {
        List<Integer> requests = elevatorCab.getRequests();
        int currentFloor = elevatorCab.getCurrentFloor();
        boolean movingUp = elevatorCab.getState() == State.UP;

        // Sort the requests based on their position relative to the current floor
        requests.sort((a, b) -> movingUp ? Integer.compare(a, b) : Integer.compare(b, a));

        for (int floor : requests) {
            if ((movingUp && floor >= currentFloor) || (!movingUp && floor <= currentFloor)) {
                return floor;
            }
        }

        // If no request found in the current direction, change direction
        elevatorCab.setState(movingUp ? State.DOWN : State.UP);
        return getNextFloorScan(elevatorCab);
    }
    

    public void openGate() {
        door.open();
    }

    public void closeGate() {
        door.close();
    }

    public boolean checkWeight() {
        // Check weight capacity
        return true;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Door getDoor() {
        return door;
    }
}
