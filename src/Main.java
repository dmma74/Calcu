import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    static int a;
    static int b;
    static int sum;
    static int x = 0;
    static int y = 0;


    static char mathe_action;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        char[] ch_line = new char[100];
        int j = -1;
        for (int i = 0; (i < line.length()); i++) {
            ch_line[i] = line.charAt(i);
            if (!SymbolR.symbolR(line.charAt(i))) {
                System.out.println("xxxxxx");
                break;}

                if (ch_line[i] == '+') {
                    mathe_action = '+';
                }
                if (ch_line[i] == '*') {
                    mathe_action = '*';
                }
                if (ch_line[i] == '-') {
                    mathe_action = '-';
                }
                if (ch_line[i] == '/') {
                    mathe_action = '/';
                }
            }

        String ch_lineString = String.valueOf(ch_line);
        String[] blocks = ch_lineString.split("[+-/*]");
        String aStr = blocks[0];
        String pbStr = blocks[1];
        String bStr = pbStr.trim();
        if (Pattern.matches("[a-zA-Z]+", aStr)) {
            a = TransArab.transArab(aStr);
            x = -1;
        } else {
            a = Integer.parseInt(aStr);
            x = 1;
        }
        if (Pattern.matches("[a-zA-Z]+", bStr)) {
            b = TransArab.transArab(bStr);
            y = -1;
        } else {
            b = Integer.parseInt(bStr);
            y = 1;
        }
        if (x < 0 && y < 0) {
            sum = Calc.calc(a, b, mathe_action);
            if ((Pattern.matches("[a-zA-Z]+", aStr)) && (Pattern.matches("[a-zA-Z]+", bStr))) {
                String sum_str = TransRom.transRom(sum);
                System.out.println(sum_str);
            }
        }
            if ((x > 0 && y > 0)) {
                sum = Calc.calc(a, b, mathe_action);
                System.out.println(sum);

            }

        }


       //sum = Calc.calc(a, b, mathe_action);
       //if ((Pattern.matches("[a-zA-Z]+", aStr)) && (Pattern.matches("[a-zA-Z]+", bStr))) {
       //    String sum_str = TransRom.transRom(sum);
       //    System.out.println(sum_str);
       //} else {
       //    System.out.println(sum);
       //}
    }




