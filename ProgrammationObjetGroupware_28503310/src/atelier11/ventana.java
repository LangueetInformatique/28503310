package atelier11;
//Correction
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ventana {

	public static void main(String[] args) {
		
		// Declaration de la JFrame
		JFrame fenetre = new JFrame("ARMENTA");
		fenetre.setSize(280, 280);
		
		JPanel marco = new JPanel();
		marco.setBackground(Color.red);
		fenetre.getContentPane().add(marco);
		
		//Creation du botton
		JMenuBar menu = new JMenuBar();
		marco.add(menu);
		
		JMenu dentro_menu = new JMenu("Prenoms");
		menu.add(dentro_menu);
		// composants du menu
		dentro_menu.add("Ana");
		dentro_menu.add("Maria");
		
		fenetre.setVisible(true);

	}

}