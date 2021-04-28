package movement;

public abstract class BaseTransport implements IMovable {
    private int time;
    private double speed;
    private String startPoint;
    private String endPoint;
    private double startTime;

    BaseTransport(int time, double speed) {
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
