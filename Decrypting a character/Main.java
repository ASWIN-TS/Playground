import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner a=new Scanner(System.in);
    if(a.hasNext())
    {
      char ch=a.next().charAt(0);
      int n=a.nextInt();
      char ch1=0;
      int f=0;
      if(ch-n<97)
      {  f=97-(ch-n);
      ch1=(char)('z'-f+1);}
      
        else
          if(ch>97)
      ch1=(char)(ch-n);
      
      
       if(ch-n<97&&ch-n>91)
      {  f=97-(ch-n);
      ch1=(char)('z'-f+1);}
      
        else
      ch1=(char)(ch-n);
     
      
      
      
       if(ch-n<65)
      { f=97-(ch-n);
      ch1=(char)('Z'-f+1);}
      
      
      System.out.println(ch1);
    }
  }
}
   