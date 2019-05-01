import java.util.Scanner;

public class Insert_Element
{
    public static void main(String []args)
    {
        int a[] = new int[3];// declaring length of array

        int i;

        for (i=0; i<a.length; i++)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("insert   element");
            int number=scanner.nextInt();

            System.out.println("specific 5(0-5)position is = ");
            int position=scanner.nextInt();
            a[position]=number; // store number value in a[position], means a[] n postition is our variable
        }
        for (i=0; i<a.length; i++)// use for loop again to print array
        {
            System.out.println("a["+i+"]="+a[i]);

        }





    }

}
