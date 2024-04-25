import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private List<ElevatorCab> elevatorCabs;

    public ElevatorSystem(int numCabs) {
        elevatorCabs = new ArrayList<>();
        for (int i = 0; i < numCabs; i++) {
            elevatorCabs.add(new ElevatorCab());
        }
    }

    public List<ElevatorCab> getElevatorCabs() {
        return elevatorCabs;
    }

    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = new ElevatorSystem(4);
        // Example usage
        elevatorSystem.getElevatorCabs().get(0).addExternalRequest(5);
    }
}

