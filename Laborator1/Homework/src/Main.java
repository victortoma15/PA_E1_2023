import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix;
        StringBuilder latin;

        int n, i, j;
        long startTime, endTime;

        n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Numarul introdus nu este valid");
        } else if (n <= 30000) {


            matrix = new ArrayList<ArrayList<Integer>>();
            for (i = 0; i < n; i++) {
                matrix.add(new ArrayList<Integer>());
            }
            for (i = 0; i < n; i++) {
                latin = new StringBuilder();
                for (j = 0; j < n; j++) {
                    matrix.get(i).add(((i + j) % n) + 1);
                    latin.append(matrix.get(i).get(j) + " ");
                }
                System.out.println(latin);
            }
            System.out.println();
            for (i = 0; i < n; i++) {
                latin = new StringBuilder();
                for (j = 0; j < n; j++) {
                    matrix.get(i).add(((i + j) % n) + 1);
                    latin.append(matrix.get(j).get(i) + " ");
                }
                    System.out.println(latin);
            }
        }
        else{
            startTime = System.nanoTime();
            matrix = new ArrayList<ArrayList<Integer>>();
            for (i = 0; i < n; i++) {
                matrix.add(new ArrayList<Integer>());
            }
            endTime = System.nanoTime();
            System.out.println("Nanoseconds required for the execution: " + (endTime - startTime));
        }
        }


    }
