package it.devlec.json;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class EsempioJSON {
    private static final Logger logger = LogManager.getLogger(EsempioJSON.class);

    public void esempioJSONOggetto(){
        JSONObject jo = new JSONObject();
        jo.put("nome", "Giovanni");
        jo.put("eta", "22");
        jo.put("citta", "Lecce");

        JSONObject ju = new JSONObject();
        ju.put("nome", "Saverio");
        ju.put("eta", "21");
        ju.put("citta", "Bari");

        JSONObject ji = new JSONObject();
        ji.put("nome", "Marco");
        ji.put("eta", "25");
        ji.put("citta", "Genova");

        logger.info("JSON "+ jo+ji+ju);

    }
    public void esempioJSONArray(){
        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("Ciao a tutti");

        JSONObject jo = new JSONObject();
        jo.put("nome", "Giovanni");
        jo.put("eta", "22");
        jo.put("citta", "Lecce");

        JSONObject ju = new JSONObject();
        ju.put("nome", "Saverio");
        ju.put("eta", "21");
        ju.put("citta", "Bari");

        JSONObject ji = new JSONObject();
        ji.put("nome", "Marco");
        ji.put("eta", "25");
        ji.put("citta", "Genova");

        ja.put(jo);
        ja.put(ju);
        ja.put(ji);
        logger.info("JSON "+ ja);
    }
}
