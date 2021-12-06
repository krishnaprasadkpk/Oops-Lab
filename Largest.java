import java.util.Scanner;

class Largest{
public static void main(String args[]){
int num,n,large=0;
Scanner inputObj=new Scanner(System.in);
System.out.println("Enter the number: ");
n=inputObj.nextInt();
for(int i=0;i<n;i++){
num=inputObj.nextInt();
if(num>large){
large=num;
}
}
System.out.println("Largest number is: "+large);

}
}
