 class Solution {

    public static String MergeAlternateString(String str1, String str2) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i<str1.length() || i<str2.length(); i++) {
            if(i<str1.length()){
                res.append(str1.charAt(i));
            }

            if(i<str2.length()){
                res.append(str2.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {

        System.out.println("String 1: asdf, String 2: qwer");

        String output = MergeAlternateString("asdf", "qwer");
        System.out.println("Output:" + output);

        System.out.println("String 1: asdf, String 2: qwertyuiop");
        String output1 = MergeAlternateString("asdf", "qwertyuiop");
        System.out.println("Output:" + output1);


        System.out.println("String 1: asdfghjkl, String 2: qwerty");
        String output2 = MergeAlternateString("asdf", "qwerty");
        System.out.println("Output:" + output2);


    }
}