import java.util.Scanner;
class Main
{
  

  public static void main(String args[])
  {
    // your code here
    Scanner a=new Scanner(System.in);
    if(a.hasNext())
    {
      int n=a.nextInt();
     System.out.println( fact(n));
  }
}
  
  public static int fact(int n)
{int o;
  if(n==1)
    return 1;
 
    o=n*fact(n-1);
    
    return o;
  
  
  }
}




