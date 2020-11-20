package tictactoe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] tttinput = new char[3][3];
        int i, j = 0;

        for (i = 0; i <= tttinput.length - 1; i++) {
            System.out.println("-");
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                tttinput[i][j] = scanner.next();
                System.out.println("| ");
                System.out.println(Arrays.toString(tttinput[i] + " "));
                System.out.println("|");

            }
        }




    }
}
