import java.util.ArrayList;

public class Compare_ArrayList
{
    public static void main(String args[])
    {

        ArrayList<String> a1= new ArrayList<String >();// array list
        a1.add("apple");
        a1.add("banana");
        a1.add("kiwi");
        System.out.println(a1);

        ArrayList<String> a2= new ArrayList<String >();
        a2.add("chiku");
        a2.add("grapes");
        a2.add("orange");
        a2.add("apple");

        ArrayList<String> a3= new ArrayList<String >();
        for (String e:a1)
            a3.add(a2.contains(e) ? "Yes":"No");
        System.out.println(a3);

    }
}
