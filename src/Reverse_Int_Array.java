public class Reverse_Int_Array
{
    public static void main(String args[])
    {
        int a[] = {10, 5, 45, 8, 10, 6};
        System.out.println("Before array Value");
        int i;
        int temp=0;
        for (i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        for (i=0; i<a.length/2; i++)//length divided /2 so loop will run half of array size
        {
             temp =a[i]; // store first array index value
             a[i]=a[a.length-i-1];// swap i value
             a[a.length-i-1]=temp;//swap i value to temp
        }
        System.out.println("array reverse");
        for (i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

}
