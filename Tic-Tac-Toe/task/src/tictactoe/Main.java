package tictactoe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       char[][] tttinput = new char[3][3];

        System.out.println();
        tttinput[0][0] = scanner.next();
        tttinput[0][1] = scanner.next();
        tttinput[0][2] = scanner.next();
        tttinput[1][0] = scanner.next();
        tttinput[1][1] = scanner.next();
        tttinput[1][2] = scanner.next();
        tttinput[2][0] = scanner.next();
        tttinput[2][1] = scanner.next();
        tttinput[2][2] = scanner.next();


//        char[] rowOne = {'O', '_', 'O'};
//        String rowOneString = Arrays.toString(rowOne);
//        char[] rowTwo = {'X', 'X', 'O'};
//        char[] rowThree = {'_', 'x', 'x'};



        System.out.println("---------");
        System.out.println("| " + tttinput[0][0] + " " + tttinput[0][1] + " " + tttinput[0][2] + " |");
        System.out.println("| " + tttinput[1][0] + " " + tttinput[1][1] + " " + tttinput[1][2] + " |");
        System.out.println("| " + tttinput[2][0] + " " + tttinput[2][1] + " " + tttinput[2][2] + " |");
        System.out.println("---------");


    }
}
