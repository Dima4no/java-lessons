package lessons.codingbat_array1;

public class CodingBatProblemsArrayOne {

    public int maxTriple(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        if (first > middle && first > last) {
            return first;
        } else if (middle > first && middle > last) {
            return middle;
        } else {
            return last;
        }
    }

    public boolean unlucky1(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        return (nums[0] == 1 && nums[1] == 3) ||
                (nums[1] == 1 && nums[2] == 3) ||
                (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
    }
}
