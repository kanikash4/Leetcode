class gcdOfTwoStrings {

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdResult = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdResult);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println("input: ABABAB , ABAB. Output: " + gcdOfStrings("ABABAB", "ABAB"));
        System.out.println();
        System.out.println("input: ABBABB, ABBABB. Output: " + gcdOfStrings("ABBABB", "ABBABB"));
        System.out.println();
        System.out.println("input: ABBA, ABBA. Output: " + gcdOfStrings("ABBA", "ABBA"));
        System.out.println();
        System.out.println("input: ABBA, ABBAB. Output: " + gcdOfStrings("ABBA", "ABBAB"));

    }
}