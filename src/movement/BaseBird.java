package movement;

public abstract class BaseBird implements IMovable {

    private int time;
    private double speed;

    BaseBird(int time, double speed) {
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
