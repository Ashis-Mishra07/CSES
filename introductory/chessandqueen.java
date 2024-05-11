import java.util.Scanner;

public class chessandqueen {
    public static boolean isSafe(char arr[][],int row,int col){
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == '*') {
                return false;
            }
        }

        // left diogonal up
        for (int i = row - 1, j = col - 1; j >= 0 && i >= 0; i--, j--) {
            if (arr[i][j] == '*') {
                return false;
            }
        }
        // right diogonal up
        for (int i = row - 1, j = col + 1; j < arr.length && i >= 0; j++, i--) {
            if (arr[i][j] == '*') {
                return false;
            }
        }
        return true;
    }
    public static void calculate(char arr[][],int row,long totalWays){
        if(row==arr.length){
            totalWays++;
            return;
        }
        for(int col=0;col<8;col++){
            if(arr[row][col]=='.' && isSafe(arr,row,col)){
                arr[row][col]='*';
                calculate(arr, row+1, totalWays);
                arr[row][col]='.';
            }
        }
    }
    public static void main(String[] args) {
        char arr[][]=new char[8][8];
        long totalWays=0;
        int row=0;

        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }

        calculate(arr,row,totalWays);
        System.out.println(totalWays);
    }
}
