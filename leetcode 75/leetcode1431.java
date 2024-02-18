import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1431. Kids With the Greatest Number of Candies
//Input: candies = [12,1,12], extraCandies = 10
//Output: [true,false,true]
//
//
//Constraints:
//
//n == candies.length
//2 <= n <= 100
//        1 <= candies[i] <= 100
//        1 <= extraCandies <= 50

class leetcode1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i <candies.length; i++) {
            if(max <= candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i <candies.length; i++) {

            int sum = candies[i] + extraCandies;
            if(sum >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {12,1,12};
        System.out.println(kidsWithCandies(array, 10));

        int[] array1 = {1,2,3,4,3,6,1,8};
        System.out.println(kidsWithCandies(array1, 4));
    }
}