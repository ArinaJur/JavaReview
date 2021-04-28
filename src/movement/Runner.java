package movement;

public class Runner extends BasePerson implements IRunnable {

    Runner(int time, double speed) {
        super(time, speed);
    }

    @Override
    public int countSteps() {
        return (int)(getDistance() * KM / PERSON_STEPS);
    }
}
