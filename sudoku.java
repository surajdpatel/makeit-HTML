import java.awt.BorderLayout;
import java.util.*;
public class sudoku {
    public static void sudoku(int array[][],int number,boolean safe) 
    {int flag = 0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println("hello"); //swap(i,j);
                }
                else
                {
                    
                }
            }
        }
    }
    public void swap(int a,int b)
    {
        int c;
        b=a;
        c=b;
        a=c;
        
    }
    public static void main(String[] args) {
        int number =1;
        boolean safe=true;
        int[][] array = new int[3][3];
        array[0][1] =4;
        array[0][2] =3;
        array[1][2] =1;
        array[2][1] =3;
        array[2][3] =1;
        array[3][0] =3;
        array[3][0] =4;
       
        sudoku(array,number,safe);
    }
}
