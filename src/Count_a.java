import java.util.Scanner;

public class Count_a {
    public static void main(String args[]) {


        String a[]=new String[100];
         Scanner scanner=new Scanner(System.in);
        System.out.println("how many string do u want to enter");
        int n =scanner.nextInt();



         int count=0;
         int i,j;

         for (i=0; i<n; i++)// give fix length to user to user will enter 3 time string name,
             //we have to give fix length to stop loop otherwise loop will continue
         {
             System.out.println("enter string name");
             String name=scanner.next();// scanner class user enter string name

             a[i]=name; // user enter string name which is store in a[] so is = to name
            // System.out.println( a[i]);

             for (j=0;j<a[i].length();j++) //checking a[i] means user input number length with loop
             {
                 if (a[i].charAt(j) == 'a') //user input check how many time a present
                 {
                     count = count + 1;// a count
                 }
             }
         }
         System.out.println("a  = "+count);

    }

}
