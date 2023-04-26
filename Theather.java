import java.util.Scanner;

public class Theater {
    
    public static void main(String[] args) {

        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };

        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int column = sc.nextInt();

        if(seats[row][column] == 0) {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }
    }
}


/*
You are creating a ticketing program for a small movie theater.
The seats are represented using a 2-dimensional array.
Each item can have the values 1 and 0 - 1 is occupied, and 0 if it's free.
Your program needs to take as input the row and the column of the seat and output Free if it's free, and Sold if it's not.
*/
