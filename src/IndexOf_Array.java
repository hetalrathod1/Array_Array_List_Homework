import java.util.Scanner;

public class IndexOf_Array
{
    public static void main(String args[])
    {
        int a[]={25,10,2,45,10,24,1,5};// declartion n initialisation

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter no");
        int numb=scanner.nextInt();
        int i;
        int b=0;
         for (i=0; i<a.length; i++)
        {
           //  System.out.println(a[i]);
            if (numb ==a[i]) // no 10 is present in a[] list n print result
            {
                 b=0;
                 //System.out.println("in"+b);
            }

        }

         if (b==0)// checking b value is same to 0
         {
             System.out.println("a"+"["+i+"]"+"="+numb);
         }
         else
         {
             System.out.println("number not present in array");
         }

    }
}
