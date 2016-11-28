package com.easylearning.easylearning;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 28.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */

public class Content {

    public Content() {}

    //******************** electrostatic field ********************//

    //----------- electrical Charge ----------//

    private ArrayList<String> derivationChargeText = new ArrayList<>(Arrays.asList(
            "Protonen (e+) sind positiv geladen Qp und Elektronen (e-) sind negativ geladen Qe. \n\n" +
            "Die Ladung beider Teilchen ist gleich groß, aber stets entgegengesetzt.\n\n" +
            "Das Formelzeichen für die Ladung ist Q.\n\n" +
            "Die kleinste Ladung, also die eines Protons oder Elektrons wird Elementarladung e genannt und beträgt e=1,6021892*10^19 As." +
            "Die Einheit der Elementarladung ist [e] = C (Coulumb) = As (Amperesekunden)\n\n" +
            "Alle beobachtbaren Ladungen Q sind ein ganzzahliges Vielfaches der Elekrtonenladung e\n" +
            "      Q = N*e"
    ));

    private Quiz derivationChargeQuiz1 = new Quiz(
            "Was stimmt für die Elemtarladung?" , "answer2"
    );

    public ArrayList<String> getTextContent() {
        return derivationChargeText;
    }

    public Quiz getQuiz() {
        derivationChargeQuiz1.addOption("answer1");
        derivationChargeQuiz1.addOption("answer2");
        derivationChargeQuiz1.addOption("answer3");
        derivationChargeQuiz1.addOption("answer4");
        return derivationChargeQuiz1;
    }
}
