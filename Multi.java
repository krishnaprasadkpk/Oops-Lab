import java.util.Scanner;
class Multi{
public static void main(String args[]){
int i,j,k,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the dimensions of matrix A");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter the dimensions of Matrix B");
int p=sc.nextInt();
int q=sc.nextInt();
if (n==p){
  int A[][] = new int[m][n];
  int B[][] = new int[p][q];
  int C[][] = new int[m][q];
  
  System.out.println("Enter the elements of matrix A: ");
  for(i=0; i<m; i++)
  {
    for(j=0; j<n; j++)
    {
      A[i][j] = sc.nextInt();
    }
  }
  
  System.out.println("Enter the elements of matrix B: ");
  for(i=0; i<p; i++)
  {
    for(j=0; j<q; j++)
    {
      B[i][j] = sc.nextInt();
    }
  }
  
  System.out.println("\n\noutput matrix:-");
  for ( i= 0 ; i < m ; i++ )
   {
    for ( j= 0 ; j <q;j++)
     {
      sum=0;
 for ( k= 0 ; k <n;k++ )
  {
   sum +=A[i][k]*B[k][j] ;
 
  }
  C[i][j]=sum;
  }
  for ( i= 0 ; i < m; i++ )
  {
  for ( j=0 ; j < q;j++ )
   System.out.print(C[i][j]+"\t");
 
   System.out.println();
  }  
  }
}
else{
System.out.print("multipication does not exist ");
}
}
  
  
  




}
