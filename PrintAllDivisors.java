import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class PrintAllDivisors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find if its divisors: ");
        int n = input.nextInt();
        
        printAllDivisors(n);
    }
    
    static void printAllDivisors(int n){
        List<Integer> numbers = new ArrayList<>();
        // for (int i = 1; i <= n ; i++){
        //     if (n%i == 0) System.out.print(i + " ");
        // }

        for(int i = 1 ; i <= Math.sqrt(n); i++){
            if (n%i == 0){
                numbers.add(i);
                if (n/i != i ){
                    numbers.add(n/i);
                }
            } 
            
        }
        
        Collections.sort(numbers);
        System.out.print("The divisors are : ");
        for(int divisor : numbers){
            System.out.print(divisor + " ");
        }

    }
}