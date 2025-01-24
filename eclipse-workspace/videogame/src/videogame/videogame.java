//Peyton 1/15 Videogame but actually randomnumber generator
package videogame;

	import javax.swing.JOptionPane;

	public class videogame {
	    public static void main(String[] args) {
 	        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");

 	        int randomNumber = 1 + (int) (Math.random() * 10);

 	        JOptionPane.showMessageDialog(null, "The random number is: " + randomNumber);
	    }
	}