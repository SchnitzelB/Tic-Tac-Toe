package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X");
        System.out.print("O");
        System.out.print("X");

        char[] tttinput = {'O', '_', 'O', 'X', 'X', 'O', '_', 'X', 'X'};



        System.out.println("---------");
        System.out.print("| ");
        System.out.print(tttinput);
        System.out.print(" |");
        System.out.println("---------");

    }
}
