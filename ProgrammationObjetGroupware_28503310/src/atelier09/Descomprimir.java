package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Descomprimir {
 
	public static void main(String[] args) {
		//cadena que contiene la ruta donde están los archivos .zip
		String directorioZip = "src/atelier09/";
		//ruta donde están los archivos .zip
		File carpetaExtraer = new File(directorioZip);
		
		//valida si existe el directorio
		if (carpetaExtraer.exists()) {
			//lista los archivos que hay dentro  del directorio
			File[] ficheros = carpetaExtraer.listFiles();
			System.out.println("Número de ficheros encontrados: " + ficheros.length);
			
			//ciclo para recorrer todos los archivos .zip
			for (int i = 0; i < ficheros.length; i++) {
				System.out.println("Nombre del fichero: " + ficheros[i].getName());
				System.out.println("Descomprimiendo.....");
				try {
					//crea un buffer temporal para el archivo que se va descomprimir
					ZipInputStream zis = new ZipInputStream(new FileInputStream(directorioZip + ficheros[i].getName()));
 
					ZipEntry salida;
					//recorre todo el buffer extrayendo uno a uno cada archivo.zip y creándolos de nuevo en su archivo original 
					while (null != (salida = zis.getNextEntry())) {
						System.out.println("Nombre del Archivo: "+salida.getName());	
							FileOutputStream fos = new FileOutputStream(directorioZip + salida.getName());
							int leer;
							byte[] buffer = new byte[1024];
							while (0 < (leer = zis.read(buffer))) {
								fos.write(buffer, 0, leer);
							}
							fos.close();
							zis.closeEntry();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			System.out.println("Directorio de salida: " + directorioZip);
		} else {
			System.out.println("No se encontró el directorio..");
		}
	}
}

}
