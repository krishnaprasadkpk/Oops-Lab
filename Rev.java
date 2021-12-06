import java.util.Scanner;
class Rev{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the String: ");
 String str=sc.nextLine();
 String reve="";
 int len=str.length();
 
 for(int i=len-1;i>=0;i--)
 {
   reve=reve+str.charAt(i);
 }
 System.out.println(reve);
}

}
