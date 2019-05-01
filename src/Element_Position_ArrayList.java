import java.util.ArrayList;

public class Element_Position_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<String> name =new ArrayList<>();// create array list
        name.add("hetal");
        name.add("chirag");
        name.add("nishu");
        name.add("ila");

        int a=name.indexOf("chirag");// find index of given element
        int b= name.indexOf("nishu");
        System.out.println(a);
        System.out.println(b);
    }
}
