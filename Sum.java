import java.util.Scanner;

class Sum{
public static void main(String args[]){
Scanner inputObj=new Scanner(System.in);
System.out.println("Enter an integer: ");
int num=inputObj.nextInt();
int sum=0;
while(num>0){
sum=sum+(num%10);
num=num/10;

}
System.out.println("Sum = "+sum);
}
}

