import java.util.Arrays;

public class EquilityOfTwo_Array
{
    public static void main(String args[])
    {
        int a[]={10,20,5,86,9};
        int b[]={65,25,65,42,3};
        int c[]={65,25,65,42,3};
        // checking equality of a b
        System.out.println("euqal array = "+ Arrays.equals(a,b));
        // checking equality of b c
        System.out.println("euqal array = "+ Arrays.equals(b,c));

    }
}
