/**
 * Created by chaitany on 01/06/15.
 */
import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.util.Scanner;
public class game {
    public static void main(String[] args)
    {
        int a[][]=new int[10][10];
        int i=0,j=0,counter=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter order of n*n matrix");
        int n=input.nextInt();
        System.out.println("Enter values into matrix ");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        for(int l=1;l<n;l++)
        {
            for(int m=1;m<n;m++)
            {
                for (int k = -1; k < 2; k++)
                    if (a[l + k][m + k] != 0)
                        counter++;
            }
        }
        System.out.println("number of cells alive :" +counter);
    }
}
