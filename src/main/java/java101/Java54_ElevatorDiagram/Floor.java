package java101.Java54_ElevatorDiagram;

public class Floor {
    private int floorNumber;
    private CallButton callButton;
    private ArrivalLight arrivalLight;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.callButton = new CallButton(Direction.UP);
        this.arrivalLight = new ArrivalLight();
    }

    public void callElevator(Direction direction) {
        // Asansörü çağırma işlemleri
    }

    public void pressButton(Direction direction) {
        // Düğmeye basma işlemleri
    }
}
