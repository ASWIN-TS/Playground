import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner a= new Scanner(System.in);
      int c=0;
      if(a.hasNext())
      {
        String s=a.nextLine();
         int n=s.length();
        for(int i=0,j=n-1;i<n;i++,j--)
          if(s.charAt(i)!=s.charAt(j))
            c=1;
        if(c==0)
          System.out.println("Yes");
          else
            System.out.println("No");
    } 
}
}
