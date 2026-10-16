import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       int[][] a=new int[3][3];
           System.out.println("Enter the elements into First  matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
         int[][] b=new int[3][3];
           System.out.println("Enter the elements into Second  matrix");
        for(int m=0;m<3;m++){
            for(int n=0;n<3;n++){
                b[m][n]=sc.nextInt();
                
            }
        }
        int[][] c=new int[3][3];
        System.out.println("The  Sum of Two Matrices is: ");
        
        for(int r=0;r<3;r++){
            for(int s=0;s<3;s++){
               c[r][s]=a[r][s]+b[r][s];
              System.out.print(c[r][s]+" ");  
            
            }
            System.out.println();
        }
        
         }
    }

