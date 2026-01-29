import java.util.Scanner;

class CheckPalindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find if its palindrome : ");
        int n = input.nextInt();

        checkPalindrome(n);
    }

    static void checkPalindrome(int n){
        int original = n;
        int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            revNum = (revNum*10)+lastDigit;
        }
        System.out.println("The reversed number is : " + revNum);

        if (revNum == original){
            System.out.println("The number is palindrome ");
        }else{
            System.out.println("The number is not palindrome");
        }

    }
}