package atelier12;

/*
 * Creacion de una ventana
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testJTextComponent {


	public static void main(String[] args) {
		 JFrame fen = new JFrame("testJTextField"); fen.setSize(280, 280); 
		 JPanel p = new JPanel();
		 fen.getContentPane().add(p);
		 JTextField jtf = new JTextField("Armenta");
		 p.add(jtf);
		 fen.setVisible(true);
	}
}
