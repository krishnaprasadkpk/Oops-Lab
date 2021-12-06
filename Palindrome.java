import java.util.Scanner;

class Palindrome
{
public static void main(String args[]){
String s,rev="";
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
s = sc.nextLine();
int len = s.length();
for(int i=len-1;i>=0;i--)
    rev=rev+s.charAt(i);
System.out.println(rev);
    
if(rev.equals(s)){
System.out.println("The entered string is a palindrome");
}
else{
System.out.println("Entered string is not a palindrome");
}
}
}
