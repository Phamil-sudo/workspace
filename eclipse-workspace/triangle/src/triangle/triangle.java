// Peyton 1/15
package triangle;

public class triangle {
// I used a yt video on how to use the correct spacing
	 public static void main(String[] args) {
	        int rows = 6; // 

	        for (int i = 1; i <= rows; i++) {
 	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");
	            }

 	            for (int k = 1; k <= i; k++) {
	                System.out.print("T");
	            }

 	            for (int l = 1; l < i; l++) {
	                System.out.print("T");
	            }

 	            System.out.println();
	        }
	    }
	}
