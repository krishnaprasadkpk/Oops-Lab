import java.util.Scanner;

class string
{
public static void main(String args[]){
int flag=0;
String s,rev="";
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
s = sc.nextLine();
int len = s.length();
for(int i=len-1;i>=0;i--){
    for(int j=0;j<=len-1;j++){
        if(s.charAt(i)==s.charAt(j)){
            flag=1;
        }
    }
}
if(flag==1){
System.out.println("The entered string is a palindrome");
}
else{
System.out.println("Entered string is not a palindrome");
}
    
    

}
}
