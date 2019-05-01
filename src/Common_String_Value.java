public class Common_String_Value {
    public static void main(String args[])
    {
    String name[] = {"hetal", "chirag", "nishu", "ila","pari"};
    String name1[] = {"hetal", "nishu", "jalpa", "pahal","pari"};
    int i,j;
    for (i=0; i<name.length; i++)// first string compare
    {
        for (j=0; j<name1.length; j++)//second string compare
        {
            if (name[i]==name1[j])//compare first and second string

            {
                System.out.println("common String = "+name[i]);
            }
        }
    }
}
}
