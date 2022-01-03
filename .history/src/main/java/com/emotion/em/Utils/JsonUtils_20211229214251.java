package com.emotion.em.Utils;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

@Log4j2
public class JsonUtils {
    public JsonUtils() {
    }

    public JSONObject readJSONStringFromRequestBody(HttpServletRequest request) {
        StringBuffer json = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
        } catch (Exception e) {
            log.info("Error reading JSON string: " + e.toString());
        }
        JSONObject jObj = new JSONObject(json.toString());
        return jObj;
    }
}

