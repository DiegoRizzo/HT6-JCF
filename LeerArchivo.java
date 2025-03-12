import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
 
public class LeerArchivo {
 
    private static final String path_archivo = "pokemon_data_pokeapi.csv";
    private static Map<Integer, String[]> pokemonMap = new HashMap<>();

    private static void loadCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]); // Suponiendo que la primera columna es el ID
                pokemonMap.put(id, Arrays.copyOfRange(data, 1, data.length));
            }
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
 
}
 