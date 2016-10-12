import java.util.Scanner;
import java.util.ArrayList;
public class Eratosthene{
  public static void main(String[]args){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    calculatePrimes(primes, 0, 30); //calculatePrimesArray takes in an empty arraylist, a minimum and a maximum
  }
  public static void calculatePrimes(ArrayList<Integer>primes, int min, int max){ //method to calculate the primes from an arbitrary array of integers
    if(max<min||min<0||max<0) //runs tests for any impossible cases and stops method calculatePrimes if cases are found
      System.exit(1);
    while(min<2) //automatically starts the array at 2 (if min is below 2) because anything below that can never be prime
      min++;
    for(min=min;min<=max;min++){ //adds numbers from min to max to arraylist primes in ascending order
      primes.add(min);
    }
    int first;
    for(int o=0;o<primes.size();o++){
    first = primes.get(o);
    for(int z=o+1;z<primes.size();z++){ //iterates through arraylist primes and removes any non-prime numbers
      if(!isPrime(primes.get(z), first)){
        primes.remove(z);
        z--; //negates z++ in loop because reasons
      }
    }
    //System.out.println(primes); //print statement prints out current arrayList primes. Used to check progress
  }
    System.out.print(primes);
  }
  public static boolean isPrime(int num, int first){ //tests int num to see if it is prime
        if(num%first==0)
            return false;
    return true;
  }
}
