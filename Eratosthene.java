import java.util.Scanner;
import java.util.ArrayList;
public class Eratosthene{
  public static void main(String[]args){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    calculatePrimes(primes, 0, 30); //calculatePrimesArray takes in an empty arraylist, a minimum and a maximum
  }
  public static void calculatePrimes(ArrayList<Integer>primes, int min, int max){ //method to calculate the primes from an arbitrary array of integers
    if(max<=2||max<min||min<0||max<0) //runs tests for any impossible cases and stops method calculatePrimes if cases are found
      System.exit(1);
    while(min<2) //removes 0 and 1 from the starting number
      min++;
    for(min=min;min<=max;min++){ //adds numbers from min to max to arraylist primes in ascending order
      primes.add(min);
    }
    for(int z=0;z<primes.size();z++){ //iterates through arraylist primes and removes any non-prime numbers
      if(!isPrime(primes.get(z))){
        System.out.println(primes.get(z));
        primes.remove(z);
        z--; //negates z++ in loop because reasons
      }
    }
    System.out.print(primes);
  }
  public static boolean isPrime(int num){ //tests int num to see if it is prime
    for(int x=2;x<num;x++){
        if(num%x==0)
            return false;
    }
    return true;
  }
}
