package com.easylearning.easylearning;

import android.widget.Switch;

/**
 * Created by jenny on 25.11.16.
 */

public class Structure {

    Structure(){
    }

    //---------- Main -----------//
    private int[] main = {R.string.electrostatic_field, R.string.electrical_flow_field};

    public int[] getStructure() {
        return  main;
    }

    //----------- Topic -----------//
    private String[] electrostaticField = {"Elektrische Ladung", "Ladungsdichten", "Columb'sches Gestz", "Elektrische Feldstärke", "Überlagerung von Feldern", "Darstellung von Feldern", "Elektrische Spannungen und Potentiale", "Darstellung von Äquipotentiallinien und -flächen", "Influenz", "Dielektrische Polarisation", "Sprungestellen bei Dielektrizitätskonstanten"};
    private String[] electricalFlowField = {"Ladungsträgerbewegung", "Elektrischer Strom", "Stromdichte", "Definition Stationäres Stromungsfeld", "Spezifische Leitfähigkeit und spezifischer Widerstand", "Ohm'sches Gesetz", " Praktische Ausführungsformen von Widerstanden", "Feldgrößen an Grenzflächen", "Energie und Leistung", "Energie- und Leistungsdichte"};

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

    //---------- Content -----------//
    String h = "header";
    String t = "text";
    String q = "quiz";

    //........... electrical Charge ...........//
    private String[] electricalCharge = {"Herleitung des Begriffs", "Ladungstrennung (Ionisation)", "Rekombination"};
    private String[] chargeDensity = {"Linienladung", "Berechnung", "Ladungsträger im Festkörper"};
    private String[] coulombsLaw = {"Herleitung", "Coulomb'sches Gesetz", "Mehrfache Kraftwirkung auf eine Punktladung"};

   /* public String[] getContent(int i) {
        if (i == R.string.electrostatic_field) {i = 0;}
        return selectTopic(Integer.toString(i));
    }*/

    public String[] getContent(String s) {
        return selectContent(s);
    }

    private String[] selectContent(String topic) {
        switch (topic) {
            case "0":
            case "Elektrische Ladung":
                return electricalCharge;
            case "1":
            case "Ladungsdichten":
                return chargeDensity;
            default: return coulombsLaw;
        }
    }


}
