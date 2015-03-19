
/**
 * Write a description of class Work_7_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Work_7_1
{
    public static void main()
    {
        int x,y,tmp;
        int[] array = new int[16];
        for ( int i = 0; i < array.length ; i++)
        {
            array[i] = randomInt(100);
            System.out.print(array[i] + " ");
        }
        for ( int pass = 1 ; pass < array.length ; pass++)
        {
            for ( int i = 0; i < array.length - 1 ; i++)
            {
                if ( array[i] > array[i + 1])
                {
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
        System.out.println(" ");
        for ( int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for ( int i = 0; i < array.length ; i++)
        {
            array[i] = randomInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for ( int pass = 1 ; pass < array.length ; pass++)
        {
            for ( int i = 0; i < array.length - 1 ; i++)
            {
                if ( array[i] < array[i + 1])
                {
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
        for ( int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static int randomInt(int number)
    {  
        double randomnumber = Math.random() * number;
        int y = (int) randomnumber;
        return y;
    }
}

