// Que 1
public class ABCDEFGH {
    public static void main(String[] args) {

        int n = 5;
        // A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || i == (n - 1) / 2 || j == (n - 1) && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println(); // New Line
        // B

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < n - 1 || i == (n - 1) / 2 && j < (n - 1) || i == (n - 1) && j < (n - 1)
                        || j == (n - 1) && i > 0 && i < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println(); // NEW LINE

        // C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 && i < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println(); // NEW LINE

        // D
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) && j < (n - 1)
                        || j == (n - 1) && i > 0 && i < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println(); // NEW LINE

        // E

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n-1) / 2 || i == (n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println(); // New Line

        // F
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n-1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println(); // new line
        // G
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0&&j>0&&j<(n-1)||j==0&&i>0&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)||j==(n-1)&&i>(n-1)/2||i==(n-1)/2&&j>=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println(); // new line
        // H
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n-1)/ 2 || j == (n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}