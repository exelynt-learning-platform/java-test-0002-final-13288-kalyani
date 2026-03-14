public class MirroredNumberPyramid {
    public static void main(String[] args) {
        int n = 5;  // Number of rows for the pyramid
        
        // Loop for the upper part of the pyramid
        for (int i = 1; i <= n; i++) {
            
            // Print leading spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
