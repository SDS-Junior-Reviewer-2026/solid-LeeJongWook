package vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    public void test_sample() {
        Vehicle vehicle = new Vehicle(10);
        GasStation gasStation = new GasStation();
        assertEquals(10, vehicle.getRemainingFuel());
        vehicle.accelerate();
        assertEquals(9, vehicle.getRemainingFuel());
        gasStation.fillUp(vehicle);

        assertEquals(10, vehicle.getRemainingFuel());
    }
}
