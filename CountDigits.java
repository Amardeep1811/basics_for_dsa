import java.util.Scanner;

class CountDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its digits : ");
        int n = input.nextInt();

        countDigits(n);
    }

    static void countDigits(int n){
        int count = 0;
        while(n>0){
            count = count+1;
            n = n/10;
        }
        System.out.println(((int)count));

    }
}