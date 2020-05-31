import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner a=new Scanner(System.in);
      if(a.hasNext())
      {
      String str=a.nextLine();
        StringBuilder s=new StringBuilder(str);
      int l=s.length();
        int c=0;
        int k=0;
      for(int i=0;i<l;i++)
      { 
        if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
        {
        k=i;
       
        c=1;
        for(int j=i+1;j<l;j++)
         
          if(s.charAt(k)==s.charAt(j))
          {s.setCharAt(j,'*');
            c++;
          }
          if(s.charAt(i)>='a'&&s.charAt(i)<='z')
          { System.out.print(s.charAt(k));
          System.out.print(c+" ");}
          else
          {System.out.print((char)(s.charAt(k)-'A'+'a'));
          System.out.print(c+" ");}
        }
       
    }
}
    }
}