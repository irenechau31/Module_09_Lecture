
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tom.Wulf@uc.edu
 */
public class ArrayAlgorithms
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;
        int[] data = new int[ARRAY_SIZE];  // index 0 - 99
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        // Initialize the data array to int values from 1 - 100
        for(int e = 0; e < data.length; e++)
        {
            data[e] = rnd.nextInt(100) + 1; //rnd.nextInt(100) + 1 is range 0-99 shift 1 => 1-100
        }
        for(int e = 0; e < data.length; e++)
        {
            System.out.printf("%5d", data[e]);//printf to show value in specific style %5d
            if(e % 20 == 0 && e > 0) // if e modulo 20 = 0, print 20 per line => 5 lines, and do not show 0
            {
                System.out.println("");
            }
        }
        System.out.println("");

        // ave
        // 1st get the sum
        int sum = 0;
        for(int e = 0; e < data.length; e++)
        {
            sum = sum + data[e];  // sum += e
        }
        int ave = sum / data.length;

        System.out.println("The average of the data set is " + ave);
        // min  and max
        int min = data[0];
        int max = data[0];

        for(int e = 0; e < data.length; e++)
        {
            if(min > data[e])
            {
                min = data[e];
            }
            if(max < data[e])
            {
                max = data[e];
            }
        }
        System.out.println("The min is " + min);

        System.out.print("\n\nEnter value to search for: ");
        int searchTarget = 0;

        searchTarget = in.nextInt();
        in.nextLine(); // clear input buffer
        boolean foundTarget = false;

        // linear (brute force) search Find Last
        for(int e = 0; e < data.length; e++)
        {

            if(data[e] == searchTarget)
            {
                foundTarget = true;
                System.out.println("Found " + searchTarget + " at index " + e);
            }
        }
        if (!foundTarget)
        {
            System.out.println("Target " + searchTarget + " not found!");
        }

        foundTarget = false;
        // short circuit search with break  Find First
        for(int e = 0; e < data.length; e++)
        {
            if(data[e] == searchTarget)
            {
                foundTarget = true;
                System.out.println("Breaking! Found " + searchTarget + " at index " + e);
                break;// find the first accurance
            }
        }
        if (!foundTarget)
        {
            System.out.println("Target " + searchTarget + " not found!");
        }

    }

}
