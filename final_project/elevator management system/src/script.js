let currentFloor = 1; // Initial floor of the elevator
let isAlarmActive = false;

function callElevator() {
    document.getElementById('elevator-form').classList.remove('hidden');
}

function enterElevator() {
    console.log("Please wait for the elevator to arrive.");
    // In a real system, you would wait for the elevator to arrive and notify the user

    console.log("Elevator has arrived. You can now enter.");
    // In a real system, you would provide a way for the user to confirm they've entered the elevator

    console.log("Elevator door is closing...");
    // In a real system, you would close the elevator door

    console.log("Elevator door is closed.");
}

function exitElevator() {
    console.log("Exiting elevator...");
    // In a real system, you would provide a way for the user to confirm they've exited the elevator

    console.log("Elevator door is opening...");
    // In a real system, you would open the elevator door

    console.log("Elevator door is open. You can now exit.");
}

function submitRequest() {
    const destinationFloor = parseInt(document.getElementById('destination-floor').value);

    // Send request to server or handle internally
    console.log(`Elevator called to floor ${currentFloor}. Please wait for the elevator to go to floor ${destinationFloor}.`);

    // Simulate elevator movement
    moveElevator(destinationFloor);

    // Clear input fields
    document.getElementById('destination-floor').value = '';

    // Hide form
    document.getElementById('elevator-form').classList.add('hidden');
}

function moveElevator(destinationFloor) {
    const elevator = document.getElementById('elevator');
    const floorHeight = 100; // Height of each floor in pixels (adjust as needed)
    const animationSpeed = 500; // Animation speed in milliseconds

    const targetBottom = (destinationFloor - 1) * floorHeight;

    const currentBottom = parseInt(elevator.style.bottom);
    const distance = Math.abs(targetBottom - currentBottom);

    const frames = 50; // Number of frames for animation

    const step = (targetBottom - currentBottom) / frames;

    let frame = 0;

    const animate = () => {
        if (frame >= frames) {
            elevator.style.bottom = targetBottom + 'px';
            document.getElementById('elevator-floor').innerText = destinationFloor;
            return;
        }

        elevator.style.bottom = (parseInt(elevator.style.bottom) + step) + 'px';
        frame++;

        setTimeout(animate, animationSpeed / frames);
    };

    animate();
}


function toggleAlarm() {
    isAlarmActive = !isAlarmActive;
    const alarmElement = document.getElementById('alarm');
    alarmElement.innerText = isAlarmActive ? 'Alarm: On' : 'Alarm: Off';
}

// Other functions (callElevator, enterElevator, exitElevator, submitRequest) remain unchanged

function openDoor() {
    const elevator = document.getElementById('elevator');
    elevator.classList.add('open');
}

function closeDoor() {
    const elevator = document.getElementById('elevator');
    elevator.classList.remove('open');
}

// Toggle door function for demonstration
function toggleDoor() {
    const elevator = document.getElementById('elevator');
    if (elevator.classList.contains('open')) {
        elevator.classList.remove('open');
    } else {
        elevator.classList.add('open');
    }
}