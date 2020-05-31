import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
   Scanner in=new Scanner(System.in);
    if(in.hasNextInt())
    {
      int r1=in.nextInt();
      int c1=in.nextInt();
      int a[][]=new int[r1][c1];
      
     
    
      int c[][]=new int[c1][r1];
       for(int i=0;i<r1;i++)
        for(int j=0;j<c1;j++)
          a[i][j]=in.nextInt();
       for(int i=0;i<r1;i++)
        for(int j=0;j<c1;j++)
          c[j][i]=a[i][j];
      
      for(int i=0;i<c1;i++)
      { for(int j=0;j<r1;j++)
          System.out.print(c[i][j]+" ");
        System.out.println("");
      }
    }
  }
}

      