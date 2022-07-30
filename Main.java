import java.util.*;

public class Main{
  public static void main(String args[]){
    int n;
    int count = 1;
    int oddCount = 0;
    int evenCount = 0;

    Scanner num = new Scanner(System.in);
    
    while (count <= 10)
    {
        System.out.print("Enter number " + count + " : ");
        n = num.nextInt();

        if (n % 2 == 0)
        {
          oddCount++;
        }
        else
        {
          evenCount++;
        }

        count++;
    }

    System.out.println("No of odd numbers = " + oddCount);
    System.out.println("No of even numbers = " + evenCount);
  }
}