import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find if its ArmStrong Number: ");
        int n = input.nextInt();

        armstrongNumber(n);
    }

    static void armstrongNumber(int n){
        // we can also get digits by 
        // int k String.valueOf(num).length();
        int original = n;
        int temp = original;
        int armNumber = 0;
        int digits = 0;
        while(n>0){
            digits++;
            int lastDigit = n%10;
            n = n/10;
        }

        while(temp>0){
            int lastDigit = temp%10;
            temp = temp/10;
            armNumber = armNumber + (int)Math.pow(lastDigit,digits);
        }
        System.out.println("The armstrong number is : " + armNumber);

        if (original == armNumber) System.out.println("The number is armstrong number");
        else System.out.println("the number is not a armstrong number");

    }
}