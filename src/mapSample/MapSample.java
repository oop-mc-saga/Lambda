package mapSample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tadaki
 */
public class MapSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String codes[] = {"CTS", "FUK", "HSG", "HND", "KIX"};
        String names[] = {"新千歳空港", "福岡空港", "有明佐賀空港",
            "羽田空港", "関西空港"};

        Map<String, String> airports = new HashMap<>();
        for (int i = 0; i < codes.length; i++) {
            airports.put(codes[i], names[i]);
        }

        for (String code : airports.keySet()) {
            System.out.println(code + "->" + airports.get(code));
        }
    }

}
