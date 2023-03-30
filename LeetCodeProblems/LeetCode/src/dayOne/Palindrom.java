package dayOne;

public class Palindrom {
    public static boolean isPalindrome(int x) {
        String given = String.valueOf(x);
        int last= given.length() -1;
        for(int i=0; i< given.length(); i++  ) {
            if(given.charAt(i) != (given.charAt(last))) {
                return false;
            }
            last --;
        }
        return true;
    }
    public static void main(String[] args) {
        // testing the number
        // we can also test by creating testing files using the junit test
        System.out.println(isPalindrome(121));


        System.out.println(isPalindrome(-121));


    }
}