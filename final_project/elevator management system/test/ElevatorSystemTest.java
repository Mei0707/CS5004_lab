import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ElevatorSystemTest {
    private ElevatorSystem elevatorSystem;

    @BeforeEach
    public void setUp() {
        elevatorSystem = new ElevatorSystem(2); // Create an elevator system with 2 cabs
    }

    @Test
    public void testElevatorSystemInitialization() {
        List<ElevatorCab> elevatorCabs = elevatorSystem.getElevatorCabs();
        assertNotNull(elevatorCabs);
        assertEquals(2, elevatorCabs.size());
    }

    @Test
    public void testElevatorCabState() {
        List<ElevatorCab> elevatorCabs = elevatorSystem.getElevatorCabs();
        ElevatorCab elevatorCab = elevatorCabs.get(0);
        assertEquals(ElevatorCab.State.STOP, elevatorCab.getState());
    }

    @Test
    public void testElevatorCabMovement() {
        List<ElevatorCab> elevatorCabs = elevatorSystem.getElevatorCabs();
        ElevatorCab elevatorCab = elevatorCabs.get(0);
        elevatorCab.setCurrentFloor(3); // Set current floor to 3
        elevatorCab.addExternalRequest(5); // Request to go to floor 5
        elevatorCab.move(); // Move the elevator cab
        assertEquals(ElevatorCab.State.STOP, elevatorCab.getState());
        assertEquals(5, elevatorCab.getCurrentFloor());
    }

    @Test
    public void testDoorFunctionality() {
        ElevatorCab elevatorCab = new ElevatorCab();
        Door door = elevatorCab.getDoor();
        assertFalse(door.isOpen());
        elevatorCab.openGate();
        assertTrue(door.isOpen());
        elevatorCab.closeGate();
        assertFalse(door.isOpen());
    }
}

