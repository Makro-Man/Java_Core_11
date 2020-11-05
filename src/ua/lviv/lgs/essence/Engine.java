package ua.lviv.lgs.essence;

public class Engine {
    private int NumberOfCylinders;

    public int getNumberOfCylinders() {
        return NumberOfCylinders;
    }

    public Engine(int numberOfCylinders) {
        NumberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "NumberOfCylinders=" + NumberOfCylinders +
                '}';
    }
}
