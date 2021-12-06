import java.util.Scanner;

class primeCheck{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int isPrime=1;
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0){
        isPrime=0;
        break;
      }
    }
    if(isPrime==1)
      System.out.println(n+" is a Prime Number\n");
    else
      System.out.println(n+" is not a prime number\n");
    
  }
}
