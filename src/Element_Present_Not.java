import java.util.ArrayList;

public class Element_Present_Not {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<>();

        a.add("iteam1");
        a.add("iteam2");
        a.add("iteam3");
        a.add("iteam4");

         if (a.contains("iteam2"))// checking iteam2 present or not
        {
            System.out.println("iteam 2 present");
        }
        else
        {
            System.out.println("iteam not present in list");
        }
        if (a.contains("iteam 5"))
        {
            System.out.println("iteam present in list");
        }
        else
        {
            System.out.println("iteam5 not present in list");
        }

    }
}
