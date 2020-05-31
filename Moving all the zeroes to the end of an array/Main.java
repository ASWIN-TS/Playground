import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    if(in.hasNextInt())
    {
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      a[i]=in.nextInt();
      int j=0;
      int b[]=new int[n];
      for(int i=0;i<n;i++)
      {
        if(a[i]!=0)
        {  b[j]=a[i];j++;
        }
      
      }
for(int i=0;i<n;i++)
{
  System.out.print(b[i]+" ");
}
    }
  }
}
