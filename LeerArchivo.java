import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeerArchivo{

File archivo = new File ("pokemon_data_pokeapi.csv");

ArrayList<String> datos_temporal;
ArrayList<ArrayList<String>> datos;

    public ArrayList<ArrayList<String>> leer_TXT(String nombre_archivo) {
        datos = new ArrayList<ArrayList<String>>();

        Path filePath = Paths.get(nombre_archivo);
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datosDeLinea = linea.split("");
                datos_temporal = new ArrayList<String>();

                for (String dato : datosDeLinea) {
                    datos_temporal.add(dato);
                }
                datos.add(datos_temporal);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(datos);

        return datos;
    }
    /**
     * @return
     * devuelve los datos
     */
    public String DevolverDatos(){
        String mensaje = "";
        for(ArrayList<String> mamada : datos){
            for(String mamada2: mamada){
                mensaje+= mamada2+" ";
            }
        }
        System.out.println(mensaje);
        return mensaje;
    }

}
