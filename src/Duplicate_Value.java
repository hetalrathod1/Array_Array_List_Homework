public class Duplicate_Value
{
    public static void main(String args[])
    {
        int a[]={10,20,10,30,40,50,40};
       int i,j;
        for (i=0; i<a.length; i++)//starts from first index 0
        {
            for (j=i+1; j<a.length; j++)//loop starts from next index of array so a[1]
            {

                if (a[i]==a[j] && i!=j )//comparing array i to j to check duplicate no
                {
                    System.out.println("duplicate number is "+a[j]);
                }
            }
        }
    }
}
