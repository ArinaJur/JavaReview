package movement;

public class Tests {

    public static final double[] EXPECTED_DISTANCES = new double[] {2000.0, 10.0, 15.0};
    public static final int[] EXPECTED_STEPS = new int[] {10000, 5000};

    public static Airplane airplane = new Airplane(4, 500);
    public static Runner runner = new Runner(1, 10);
    public static Chicken chicken = new Chicken(1, 15);

    public static IMovable[] movers = new IMovable[] {airplane, runner, chicken};
    public static IRunnable[] runners = new IRunnable[] {runner, chicken};


    public static boolean assertDistance(double distance, IMovable movers) {

        return distance == movers.getDistance();
    }

    public static boolean assertSteps(int steps, IRunnable runner) {

        return steps == runner.countSteps();
    }

    public static void testDistanceCount() {
        for (int i = 0; i < EXPECTED_DISTANCES.length;  i ++) {
            System.out.println(
                    assertDistance(EXPECTED_DISTANCES[i], movers[i])
            );
        }
    }

    public static void testStepsCount() {
        for (int i = 0; i < EXPECTED_STEPS.length;  i ++) {
            System.out.println(
                    assertSteps(EXPECTED_STEPS[i], runners[i])
            );
        }
    }

    public static void main(String[] args) {

        testDistanceCount();

        System.out.println("___________________________");

        testStepsCount();

    }
}
