package atelier09;

import java.io.File;

public class MonPremierFichierTexte {
    public static void main(String args[])
    {
  
        try {
  
            // Recevoir le fichier 
            File f = new File("C:\\Users\\anita\\git\\28503310\\ProgrammationObjetGroupware_28503310\\src\\atelier09\\Nom.txt");
  
            // Créer un nouveau fichier
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