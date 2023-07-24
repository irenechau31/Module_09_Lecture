public class IntroToArrays
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // declare
        int[] grades;
        String[] names = {"Tom", "Dick", "Harry", "Bela", "Theo", "Cheyenne"};
        // size (specify how many items of that type it can store)
        //-> how many int we want the computer to set aside how many spaces for this many ints
        grades =  new int[5];  // 0 - 4 
        // Array Literals (Specify values)
        int [] numbs = {1, 2, 3, 4, 5};

        // Traversal with for loop
        for(int x = 0; x < numbs.length; x++) //loop from 0 the less than the lenghth of the numbs
        //so loop from 0-> 4th position
        {
            System.out.println("Location " + x + " " + numbs[x]);
        }

        // initialize
        for(int x = 0; x < grades.length; x++)
        {
            System.out.println("Location " + x + " " + grades[x]);
        }
        // initialize the grades array
        for(int x = 0; x < grades.length; x++)
        {
            grades[x] = x * x;   //grade 2 = 4
        }
        for(int x = 0; x < grades.length; x++)
        {
            System.out.println("Location " + x + " " + grades[x]);
        }
        for(int x = 0; x < names.length; x++)
        {
            System.out.println("Location " + x + " " + names[x]);
        }
        // display
    }

}
