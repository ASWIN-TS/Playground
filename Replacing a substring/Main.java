import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner a=new Scanner(System.in);
      if(a.hasNext())
      {
        String s=a.nextLine();
        
        String sr=a.nextLine();
        String si=a.nextLine();
        String s1=s.replace(sr,si);
        System.out.println(s1);
        
    }

    }
}
