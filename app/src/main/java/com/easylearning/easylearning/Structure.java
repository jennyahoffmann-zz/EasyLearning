package com.easylearning.easylearning;

import android.widget.Switch;

/**
 * Created by jenny on 25.11.16.
 */

public class Structure {

    private int[] main = {R.string.electrostatic_field, R.string.electrical_flow_field};
    private String[] electrostaticField = {"Elektrische Ladung", "Ladungsdichten", "Columb'sches Gestz", "Elektrische Feldstärke", "Überlagerung von Feldern", "Darstellung von Feldern", "Elektrische Spannungen und Potentiale", "Darstellung von Äquipotentiallinien und -flächen", "Influenz", "Dielektrische Polarisation", "Sprungestellen bei Dielektrizitätskonstanten"};
    private String[] electricalFlowField = {"Ladungsträgerbewegung", "Elektrischer Strom", "Stromdichte", "Definition Stationäres Stromungsfeld", "Spezifische Leitfähigkeit und spezifischer Widerstand", "Ohm'sches Gesetz", " Praktische Ausführungsformen von Widerstanden", "Feldgrößen an Grenzflächen", "Energie und Leistung", "Energie- und Leistungsdichte"};

    Structure(){
    }

    public int[] getStructure() {
        return  main;
    }

    public String[] getTopic(int i) {
        if (i == R.string.electrostatic_field) {i = 0;}
        return selectTopic(Integer.toString(i));
    }

    public String[] getTopic(String s) {
        return selectTopic(s);
    }

    private String[] selectTopic(String topic) {
        switch (topic) {
            case "0":
            case "electrostaticField":
                return electrostaticField;
            default: return electricalFlowField;
        }
    }
}
