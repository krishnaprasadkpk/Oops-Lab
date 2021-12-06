import java.util.Scanner;

class Trans{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int i,j,m,n;
   System.out.println("Enter number of rows and columns\n");
   m=sc.nextInt();
   n=sc.nextInt();
   int A[][]=new int[m][n];
   int trans[][]=new int[n][m];
   System.out.println("Enter the Elements");
   for(i=0;i<m;i++){
     for(j=0;j<n;j++){
       A[i][j]=sc.nextInt();
     }
   }
   for(i=0;i<n;i++){
     for(j=0;j<m;j++){
      trans[i][j]=A[j][i];
     }
   }
   
   System.out.println("A: ");
   for(i=0;i<m;i++){
     for(j=0;j<n;j++){
       System.out.print(A[i][j]+" ");
     }
     System.out.println();
   }
   
   System.out.println("Transpose of A: ");
   for(i=0;i<n;i++){
     for(j=0;j<m;j++){
       System.out.print(trans[i][j]+" ");
     }
     System.out.println();
   }
   
  
 }
}
