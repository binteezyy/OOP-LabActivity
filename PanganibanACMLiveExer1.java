import java.io.*;

// getBufferedInput - filter all not 1-9
public class PanganibanACMLiveExer1 {
    public static void printMagicSquare(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8,
            int num9) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n\n" + num1 + "\t" + num2 + "\t" + num3 + "\n\n" + num4 + "\t" + num5 + "\t" + num6
                + "\n\n" + num7 + "\t" + num8 + "\t" + num9 + "\n");
    }

    public static String getBufferedInput(String out_string) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input_string = "";
        System.out.println(out_string);
        try {
            input_string = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return input_string;
    }

    public static boolean checkRange(int num) {
        if (num >= 1 && num <= 9) {
            return true;
        } else
            return false;
    }

    public static boolean compareNum(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8,
            int numc) {
        if (numc == num1 || numc == num2 || numc == num3 || numc == num4 || numc == num5 || numc == num6 || numc == num7
                || numc == num8) {
            return false;
        } else
            return true;
    }

    public static boolean checkMagicSquare(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        if (sum == 15)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Start");
            int aa = 0, ab = 0, ac = 0, ba = 0, bb = 0, bc = 0, ca = 0, cb = 0, cc = 0;
            while (true) {
                // AA
                try {
                    aa = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(aa) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(ab, ac, ba, bb, bc, ca, cb, cc, aa) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (aa == 5) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // AB
                try {
                    ab = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(ab) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ac, ba, bb, bc, ca, cb, cc, ab) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (ab == 5) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // AC
                try {
                    ac = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(ac) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ba, bb, bc, ca, cb, cc, ac) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (ac == 5) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (!checkMagicSquare(aa, ab, ac)) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // BA
                try {
                    ba = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(ba) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ac, bb, bc, ca, cb, cc, ba) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (ba == 5) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // BB
                try {
                    bb = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(bb) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ac, ba, bc, ca, cb, cc, bb) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (bb != 5) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // BC
                try {
                    bc = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(bc) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ac, ba, bb, ca, cb, cc, bc) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (!checkMagicSquare(ba, bb, bc)) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // CA
                try {
                    ca = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(ca) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ac, ba, bb, bc, cb, cc, ca) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (!checkMagicSquare(aa, ba, ca) || !checkMagicSquare(ac, bb, ca)) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // CB
                try {
                    cb = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(cb) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ac, ba, bb, bc, ca, cc, cb) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (!checkMagicSquare(ab, bb, cb)) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                // CC
                try {
                    cc = Integer.parseInt(getBufferedInput("Input number from 1-9:"));
                } catch (NumberFormatException e) {
                    System.out.println("Your input was not an integer");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                if (checkRange(cc) == false) {
                    System.out.println("Your input was not in range 1-9");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (compareNum(aa, ab, ac, ba, bb, bc, ca, cb, cc) == false) {
                    System.out.println("You have entered a similar number from before");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                } else if (!checkMagicSquare(ac, bc, cc) || !checkMagicSquare(aa, bb, cc)) {
                    System.out.println("You will have a wrong combination");
                    String x = getBufferedInput("Do you want to try again? anykey/N.");
                    if (x.equals("n") || x.equals("N")) {
                        System.exit(0);
                    } else
                        break;
                }
                printMagicSquare(aa, ab, ac, ba, bb, bc, ca, cb, cc);

                if (checkMagicSquare(aa, ab, ac) && checkMagicSquare(ba, bb, bc) && checkMagicSquare(ca, cb, cc)
                        && checkMagicSquare(ac, bb, ca) && checkMagicSquare(aa, bb, cc)) {
                    System.out.println("Your combination can be in a magic square");
                } else
                    System.out.println("Your combination cannot be in a magic square");
                String x = getBufferedInput("Do you want to try again? anykey/N.");
                if (x.equals("n") || x.equals("N")) {
                    System.exit(0);
                } else
                    break;

            }
        }
    }
}
