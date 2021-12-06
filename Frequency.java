import java.util.Scanner;
class Frequency{
public static void main(String args[]){
int freq=0;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
s=sc.nextLine();
int len=s.length();
System.out.println("Enter the character");
char c=sc.next().charAt(0);


for(int i=0;i<len;i++){
  
    if(s.charAt(i) == c){
      freq=freq+1;
    }
}
System.out.println("Number of ocuurences = "+freq);
    
    

}
}

