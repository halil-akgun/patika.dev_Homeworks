package java101.Java54_ElevatorDiagram;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int capacity;
    private int currentFloor;
    private List<Integer> targetFloors;
    private boolean isMoving;

    public Elevator(int capacity) {
        this.capacity = capacity;
        this.currentFloor = 1;
        this.targetFloors = new ArrayList<>();
        this.isMoving = false;
    }

    public void moveUp() {
        // Asansörü yukarı hareket ettirme işlemleri
    }

    public void moveDown() {
        // Asansörü aşağı hareket ettirme işlemleri
    }

    public void openDoor() {
        // Asansör kapılarını açma işlemleri
    }

    public void closeDoor() {
        // Asansör kapılarını kapama işlemleri
    }

    public void addFloor(int floorNumber) {
        // Hedef kat ekleme işlemleri
    }
}