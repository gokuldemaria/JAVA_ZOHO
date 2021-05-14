import java.util.ArrayList;
import java.util.List;

public class sum3 {

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        //System.out.println(threeSum(nums));
        threeSum(nums);

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {

                    while(i != j && i != k && j != k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {

                            List<Integer> tempList = new ArrayList<>();
                            tempList.add(k);
                            tempList.add(j);
                            tempList.add(i);

                            resultList.add(tempList);

                        }

                    }

                }
            }
        }
        System.out.println(resultList);
        return null;

    }
}
