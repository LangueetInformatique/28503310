package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
 
public class Comprimir {
 
	public static void main(String[] args) {
		
		String directorioZip = "src/atelier09/";
		
		File carpetaComprimir = new File(directorioZip);
		
		if (carpetaComprimir.exists()) {
			
			File[] ficheros = carpetaComprimir.listFiles();
			System.out.println("Número de ficheros encontrados: " + ficheros.length);
 		
			for (int i = 0; i < ficheros.length; i++) {
				System.out.println("Nombre del fichero: " + ficheros[i].getName());
				String extension="";
				for (int j = 0; j < ficheros[i].getName().length(); j++) {
					
					if (ficheros[i].getName().charAt(j)=='.') {
						extension=ficheros[i].getName().substring(j, (int)ficheros[i].getName().length());
						System.out.println(extension);
					}
				}
				try {
					
					ZipOutputStream zous = new ZipOutputStream(new FileOutputStream(directorioZip + ficheros[i].getName().replace(extension, ".zip")));
					
					ZipEntry entrada = new ZipEntry(ficheros[i].getName());
					zous.putNextEntry(entrada);
					
						System.out.println("Nombre del Archivo: " + entrada.getName());
						System.out.println("Comprimiendo.....");
						
						FileInputStream fis = new FileInputStream(directorioZip+entrada.getName());
						int leer;
						byte[] buffer = new byte[1024];
						while (0 < (leer = fis.read(buffer))) {
							zous.write(buffer, 0, leer);
						}
						fis.close();
						zous.closeEntry();
					zous.close();					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
			System.out.println("Directorio de salida: " + directorioZip);
		} else {
			System.out.println("No se encontró el directorio..");
		}
	}
}