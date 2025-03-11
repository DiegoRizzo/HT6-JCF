import java.util.HashMap;
import java.util.Map;

public class MAPFactory {
    
    public static <K, V> Map<K, V> createMap() {
        return new HashMap<>();
    }

}
