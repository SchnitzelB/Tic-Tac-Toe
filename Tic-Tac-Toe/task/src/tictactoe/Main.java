package tictactoe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] tttinput = new char[9];
        String tttAsString = Arrays.toString(tttinput);

        System.out.println("Enter an X.");
        String userInput = scanner.next();
        for (userInput.equals()) {

        }

        //        char[] rowOne = {'O', '_', 'O'};
//        String rowOneString = Arrays.toString(rowOne);
//        char[] rowTwo = {'X', 'X', 'O'};
//        char[] rowThree = {'_', 'x', 'x'};



        System.out.println("---------");
        System.out.println("| " + tttAsString.charAt(0) + " " + tttAsString.charAt(1) + " " + tttAsString.charAt(2) + " |");
        System.out.println("| " + tttAsString.charAt(3) + " " + tttAsString.charAt(4) + " " + tttAsString.charAt(5) + " |");
        System.out.println("| " + tttAsString.charAt(6) + " " + tttAsString.charAt(7) + " " + tttAsString.charAt(8) + " |");
        System.out.println("---------");


    }
}
