public class SumValue_Array
{
    public static void main(String args[])
    {

        int  number[]={10,12,4,25,5};// intialisation and declaration
        int sum=0;
        int i;

        for (i=0; i<number.length; i++)
        {
            sum=sum+number[i];// sum=0+10 n then 10+12 loop continue for addition

         }
        System.out.println("sum value of array = "+sum);

    }
}
