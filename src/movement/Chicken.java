package movement;

public class Chicken extends BaseBird implements IRunnable {

    Chicken(int time, double speed) {
        super(time, speed);
    }

    @Override
    public int countSteps() {
        return (int)(getDistance() * KM / CHICKEN_STEPS);
    }
}
