import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int inputLineLength = inputLine.length();

        int counter = 0;

        String[] inputLineToStringArray = inputLine.split("");


        for (String s : inputLineToStringArray) {
            if (s.toLowerCase(Locale.ROOT).equals("g") ||
            s.toLowerCase(Locale.ROOT).equals("c")){
                counter++;
            }
        }

        double res = (double) counter / inputLineLength * 100;
        System.out.println(res);

    }
}