import java.util.ArrayList;

public class Replace_Element_ArrayList
{
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hetal");
        arr.add("nishu");
        arr.add("chirag");
        arr.add("ila");

        arr.set(0,"pari");// .set to replace element , 0 index n element pari

        System.out.println(arr);
    }

}
