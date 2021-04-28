package interfaces.school.tests;

public class Assert {

    public static void jUnitAssert(double expectedResult, double actualResult) {
        System.out.println(expectedResult == actualResult);
    }

    public static void testNGAssert(double actualResult, double expectedResult) {
        System.out.println(actualResult = expectedResult);
    }
}
