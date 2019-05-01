import java.util.ArrayList;
import java.util.List;

public class Clone_Arraylist
{
    public static void main(String args[])
    {
        ArrayList<String> arr=new ArrayList<>();//create array list
        arr.add("hetal");// add value in object arr
        arr.add("chirag");
        arr.add("nishu");

        System.out.println("arry list"+arr);

        ArrayList<String>arr1=(ArrayList<String>)arr.clone();// right n side value  store in left n side

        System.out.println("copy arraylist"+arr1);
    }
}
