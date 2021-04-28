package movement;

public abstract class BasePerson implements IMovable {
    private int time;
    private double speed;

    BasePerson(int time, double speed) {
        this.time = time;
        this.speed = speed;
    }

    @Override
    public double getTime() {
        return Double.parseDouble(Integer.toString(time));
    }

    @Override
    public double getDistance() {
        return getTime() * speed;
    }
}
