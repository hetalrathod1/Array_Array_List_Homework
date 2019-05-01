public class Transpose_Matrix_2D
{
    public static void main(String args[])
    {
        int[][]a={{10,20,40},{55,60,50},{54,23,12}};// create matrix
        int[][]b= new int[3][3]; // store value of a n create matrix to convert row to column
        System.out.println("2D array");
        int i,j;
        for (i=0; i<3; i++)      // this loop for printing a array value
            {
            for (j=0; j<3; j++)//loop for b array
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("transpose matrix ");//converting row to column
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");
            }

            System.out.println();

        }



    }
}
