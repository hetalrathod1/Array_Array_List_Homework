import java.util.Scanner;

public class Array_Specific_Value
{
    public static void main(String args[]) {
        int a[] = {10, 20, 50, 80, 46, 57, 2, 5, 4, 0};// intialisation n declaration of array
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no");
        int number= scanner.nextInt();
         boolean b=false;
        int i;
        for (i=0;i<a.length; i++)
        {
            if (number==a[i])// checking number value is same to array valuea[i]
            {
                   b=true;
             }
            else
            {
                  b=false;
             }
        }
        if (b)// use condintion again to print msg in consol because if you print in for loop inside if condition
            //it will print condition how many times loop continue
        {
            System.out.println(" value present in array");
        }
        else
        {
            System.out.println("value not present in array");
        }


    }
}
