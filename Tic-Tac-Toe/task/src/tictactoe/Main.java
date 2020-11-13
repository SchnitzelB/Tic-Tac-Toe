package tictactoe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = 9;
        char[] tttinput = new char[len];

        tttinput[0] = scanner.next();
        tttinput[1] = scanner.next();
        tttinput[2] = scanner.next();
        tttinput[3] = scanner.next();
        tttinput[4] = scanner.next();
        tttinput[5] = scanner.next();
        tttinput[6] = scanner.next();
        tttinput[7] = scanner.next();
        tttinput[8] = scanner.next();

        if (tttinput == 'X' && tttinput == 'O') {
            tttinput = array.;
        }

//        char[] rowOne = {'O', '_', 'O'};
//        String rowOneString = Arrays.toString(rowOne);
//        char[] rowTwo = {'X', 'X', 'O'};
//        char[] rowThree = {'_', 'x', 'x'};



        System.out.println("---------");
        System.out.println("| " + tttinput[0] + " " + tttinput[1] + " " + tttinput[2] + " |");
        System.out.println("| " + tttinput[3] + " " + tttinput[4] + " " + tttinput[5] + " |");
        System.out.println("| " + tttinput[6] + " " + tttinput[7] + " " + tttinput[8] + " |");
        System.out.println("---------");


    }
}
