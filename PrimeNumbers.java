import java.util.Scanner;

class PrimeNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its prime : ");
        int n = input.nextInt();

        primeNumbers(n);
    }

    static void primeNumbers(int n){
        int count = 0 ;
        for(int i = 1 ; i *i <= n ; i++){
            if(n % i == 0){
                count ++;
                if(n/i != 1 ){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("The nuumber is a prime number");
        }else{
            System.out.println("The number is not prime");
        }

    }
}