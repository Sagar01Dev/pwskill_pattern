// Que 5
public class SAGARNASARE {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // S
            for (int j = 0; j <n; j++) {

                if (i==0 && j>0 && j<(n-1) ||  j==0&&i>0&&i<(n-1)/2|| i==(n-1)/2&&j>0&&j<(n-1)||j==(n-1)&&i>(n-1)/2&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // A

            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || i == (n - 1) / 2 || j == (n - 1) && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // G
            for (int j = 0; j < n; j++) {
                if (i==0&&j>0&&j<(n-1)||j==0&&i>0&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)||j==(n-1)&&i>(n-1)/2||i==(n-1)/2&&j>=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // A
           for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || i == (n - 1) / 2 || j == (n - 1) && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
    //    R
            for (int j = 0; j < n; j++) {
                if (j==0&&i>0||i==0&&j>0&&j<(n-1)||i==(n-1)/2&&j<(n-1)||j==(n-1)&&i>0&&i<(n-1)/2||(i-j)==2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
          
            System.out.print("        ");

            // N
              for (int j = 0; j < n; j++) {
                if (j == 0 || j==(n-1) || i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // A
              for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || i == (n - 1) / 2 || j == (n - 1) && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // S
            for (int j = 0; j <n; j++) {

                if (i==0 && j>0 && j<(n-1) ||  j==0&&i>0&&i<(n-1)/2|| i==(n-1)/2&&j>0&&j<(n-1)||j==(n-1)&&i>(n-1)/2&&i<(n-1)||i==(n-1)&&j>0&&j<(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // A
           for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || i == (n - 1) / 2 || j == (n - 1) && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // R
              for (int j = 0; j < n; j++) {
                if (j==0&&i>0||i==0&&j>0&&j<(n-1)||i==(n-1)/2&&j<(n-1)||j==(n-1)&&i>0&&i<(n-1)/2||(i-j)==2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
          
            System.out.print("   ");

            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n-1) / 2 || i == (n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();





        }
    }
}
