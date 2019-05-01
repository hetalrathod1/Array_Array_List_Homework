import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class String_Count
{
    public static void main(String args[]) {
         String sentence="hello how r you 19.80";

        char a[]=sentence.toCharArray();// store string to array
        int i;
        int l=0,s=0,n=0,sp=0;
        for (i=0; i<a.length; i++)
        {
             if (Character.isLetter(a[i]))//compare letter
             {
                 l=l+1;// count letter
             }
             else if (Character.isDigit(a[i])) // compare number
             {
                 n=n+1; // count number
             }
             else if (Character.isSpaceChar(a[i])) // compare space
             {
                 s=s+1; // count spaces
             }
             else
             {
                 sp=sp+1;
             }
          }
        System.out.println("letter count :" + l);
        System.out.println("number count :"+n);
        System.out.println("space count : "+s);
        System.out.println("special charater and other char : "+sp);
    }
}
