package lessons.codingbat_array1;

public class TestUtility {

    public static <T> void testMethod(String methodName, T expectedResult, T actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test PASSED '" + methodName + "'");
        } else {
            System.out.println(
                "Test '" + methodName + "' FAILED, expected = " + expectedResult + ", but actual = " + actualResult);
        }
    }

}
