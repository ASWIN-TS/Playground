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
        int k=0;
        int a1[]=new int[26];
        
        for(int i=0;i<l;i++)
        {
          
          if(s.charAt(i)>='a'&&s.charAt(i)<='z')
          {
            k=s.charAt(i)-'a';
            a1[k]=a1[k]+1;
          }
              if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
          {
            k=(s.charAt(i)-'A');
            a1[k]=a1[k]+1;
          }
        }
        for(int i=0;i<=25;i++)
          if(a1[i]==0)
          {   System.out.print((char)(i+'a'));
        System.out.print(" ");}
      }
    }
}

