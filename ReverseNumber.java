import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its reverse : ");
        int n = input.nextInt();

        reverseNumber(n);
    }

    static void reverseNumber(int n){
        int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            revNum = (revNum * 10)+lastDigit;
        }
        System.out.println("The reversed number is : "+revNum);

    }
}