

//605. Can Place Flowers

//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
//
//
//Constraints:
//
//        1 <= flowerbed.length <= 2 * 104
//flowerbed[i] is 0 or 1.
//There are no two adjacent flowers in flowerbed.
//        0 <= n <= flowerbed.length


class leetcode605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        for (int i = 0; i < flowerbed.length; ++i)
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                if (--n == 0)
                    return true;
            }

        return false;
    }

    public static void main(String[] args) {
        int[] a ={1,0,0,0,1};
        System.out.println(canPlaceFlowers(a,2));

        int[] b ={1,0,0,0,1};
        System.out.println(canPlaceFlowers(b,1));

    }
}