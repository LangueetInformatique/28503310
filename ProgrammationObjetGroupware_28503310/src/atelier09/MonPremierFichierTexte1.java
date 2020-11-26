package atelier09;

import java.io.File;
import java.io.PrintWriter;

public class MonPremierFichierTexte1 {
    public static void main(String args[])
    {
		String ligne;
		String nfich = "src/atelier09/Nom.txt";
		
        try {
  
            // Recevoir le fichier 
        	
            // Créer un nouveau fichier
            File f = new File(nfich);
			
			PrintWriter pr = new PrintWriter(f);
			pr.println("M. Montacié");
			pr.println("Julien");
			pr.println("Alexane");
			pr.println("Chenwangli");
			pr.println("Ana");
			pr.println("Mustapha");
			
			pr.close();
            // Vérifier s'il n'existe pas
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}