import java.util.Scanner;

class PrintGcd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find its gcd : ");
        int a = input.nextInt();
        int b = input.nextInt();

        primeNumbers(a,b);
    }

    static void primeNumbers(int a , int b){
        int gcd = 0;
        while(a > 0 && b > 0){
            if (a > b) a = a % b;
            else if (b > a) b = b % a;
        }

        if (a == 0) gcd = b;
        else if (b == 0) gcd = a; 
        System.out.println("The gcd is : " + gcd);

    }
}