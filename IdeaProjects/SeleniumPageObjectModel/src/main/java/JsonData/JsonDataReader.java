package JsonData;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class JsonDataReader {
    public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {

        // Read Json Data to String
        String jsonData = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

        // Read String Data to HashMap
        ObjectMapper map = new ObjectMapper();
        List<HashMap<String, String>> data = map.readValue(jsonData, new TypeReference<List<HashMap<String, String>>>() {
        });

        return data;
    }
}
