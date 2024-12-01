package lessons.codingbat_array1;

public class CodingBatMain {

    public static final String SEPARATOR = "------------------------------------------------------------------";

    public static void main(String[] args) {
        CodingBatProblemsArrayOne problems = new CodingBatProblemsArrayOne();

        System.out.println(SEPARATOR);
        TestUtility.testMethod("maxTriple", 3, problems.maxTriple(new int[]{1, 2, 3}));
        TestUtility.testMethod("maxTriple", 5, problems.maxTriple(new int[]{1, 5, 3}));
        TestUtility.testMethod("maxTriple", 5, problems.maxTriple(new int[]{5, 2, 3}));
        TestUtility.testMethod("maxTriple", 0, problems.maxTriple(new int[]{}));
        TestUtility.testMethod("maxTriple", 0, problems.maxTriple(null));
        System.out.println(SEPARATOR);

        TestUtility.testMethod("unlucky1", true, problems.unlucky1(new int[]{1, 3, 4, 5}));
        TestUtility.testMethod("unlucky1", true, problems.unlucky1(new int[]{2, 1, 3, 4, 5}));
        TestUtility.testMethod("unlucky1", false, problems.unlucky1(new int[]{1, 1, 1}));
    }



}
