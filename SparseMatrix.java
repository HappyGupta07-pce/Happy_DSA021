import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]mat = new int[row][col];
        int nz = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j<col; j++){
                mat[i][j]=sc.nextInt();
                if (mat[i][j] != 0){
                    nz = nz + 1;
                }
            }
        }
         System.out.println("Matrix:");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
            System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
            }
            
            
        int [][]s = new int[nz + 1][3];
        s[0][0]= row;
        s[0][1]= col;
        s[0][2]= nz;
        int k = 1;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(mat[i][j] != 0){
                    s[k][0] = i;
                    s[k][1] = j;
                    s[k][2] = mat[i][j];
                    k++;
                }
            }
        }
        
         System.out.println();
        System.out.print("Sparse Matrix:");
        for(int i = 0 ; i <= nz ; i++){
            System.out.println(s[i][0]+" "+s[i][1]+ " "+s[i][2]);
            }
    }
}
        
    
