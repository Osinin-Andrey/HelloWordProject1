package by.osinin.homework.lesson5;

import java.util.Arrays;

public class FifthHomeworkSecondTask {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if ((i + j) % 2 == 0)
                    chess[i][j] = "W";
                else
                    chess[i][j] = "B";
            }
        }
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j]);
            }

            System.out.println();
        }

    }

}

