package lesson5.tasks;

public class extra {
    public static void main(String[] args) {
        int num = -123;
        int n = num;
        int rev = 0;
        while (Math.abs (n) > 0) { //1 > 0
            int last = n % 10; //1
            n /= 10; //0
            rev = rev * 10 + last; // 32*10 + 1
        }
        boolean isPalindrome = num == rev;
        System.out.println (num + " is" + (isPalindrome? " " : " not ") + "palindrome");
    }
}
