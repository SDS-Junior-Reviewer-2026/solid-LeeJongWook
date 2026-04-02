package vehicle;

public class GasStation {
    // 주유소의 책임: 대상을 주유한다.
    public void fillUp(Vehicle vehicle) {
        int max = vehicle.getMaxFuel();
        vehicle.setRemainingFuel(max);
        System.out.println("주유 완료! 현재 연료: " + vehicle.getRemainingFuel());
    }
}