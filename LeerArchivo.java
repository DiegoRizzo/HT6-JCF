import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
 
public class LeerArchivo {
 
    File archivo = new File ("pokemon_data_pokeapi.csv");
    ArrayList<ArrayList<String>> datos;

    public ArrayList<ArrayList<String>> leer_csv(String nombre_archivo) {
        
        datos = new ArrayList<>();
        String linea;
        String separador = ",";
 
        Path filePath = Paths.get(nombre_archivo);
        try {
            BufferedReader br = Files.newBufferedReader(filePath);

            while ((linea = br.readLine()) != null) {
                String[] datos_de_linea = linea.split(separador);
                datos.add(new ArrayList<String>(Arrays.asList(datos_de_linea)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(datos);
 
        return datos;
    }
 
}
 