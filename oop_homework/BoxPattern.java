import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        //patternA(size);
        //patternB(size);
        patternA(size);
        System.out.println();
        patternB(size);
        System.out.println();
        patternC(size);
        System.out.println();
        patternD(size);
        System.out.println();
    }

    public static void patternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" # ");

                } else if (j == 1 || j == n) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");

        }
    }

    public static void patternB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" # ");
                } else if (i == j) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }


    }

    public static void patternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" # ");
                } else if (i + j == n + 1) {
                    System.out.print(" # ");

                } else {
                    System.out.print("   ");
                }


            }
            System.out.println("   ");
        }
    }

    public static void patternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" # ");
                } else if (i==j) {
                    System.out.print(" # ");

                } else if (i + j == n + 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("   ");
        }
    }
}

