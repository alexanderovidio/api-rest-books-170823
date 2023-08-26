package com.company.intecap.apibooks.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {

    private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();

    //Metodo publico que devuelve arraylist
    public ArrayList<HashMap<String, String>> getMetadata() {
        return  metadata;
    }

    //metodo para agregar un Hashmap a la lista hash
    public void setMetadata(String tipo, String codigo, String date) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("tipo", tipo);
        mapa.put("codigo", codigo);
        mapa.put("date", date);
        metadata.add(mapa);
    }
}
