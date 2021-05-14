
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        ThreeSum(nums);
    }

    public static void ThreeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        // List<Integer> templList = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {

                    // System.out.println("hji");

                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]
                            && nums[i] + nums[j] + nums[k] == 0) {

                        resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    }
                }
            }
        }
        System.out.println(resultList);
    }

}
