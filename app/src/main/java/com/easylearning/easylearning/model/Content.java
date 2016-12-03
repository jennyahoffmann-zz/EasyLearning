package com.easylearning.easylearning.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 28.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */
public class Content {
    //******************** electrostatic field ********************//

    //----------- electrical Charge ----------//

    private List<Chunk> chunk;

    private String derivationChargeText =
            "Protonen (e+) sind positiv geladen Qp und Elektronen (e-) sind negativ geladen Qe. \n\n" +
            "Die Ladung beider Teilchen ist gleich groß, aber stets entgegengesetzt.\n\n" +
            "Das Formelzeichen für die Ladung ist Q.\n\n" +
            "Die kleinste Ladung, also die eines Protons oder Elektrons wird Elementarladung e genannt und beträgt e=1,6021892*10^19 As." +
            "Die Einheit der Elementarladung ist [e] = C (Coulumb) = As (Amperesekunden)\n\n" +
            "Alle beobachtbaren Ladungen Q sind ein ganzzahliges Vielfaches der Elekrtonenladung e: Q = N*e";

    private Quiz derivationChargeQuiz1 = new Quiz(
            "Welchen Wert hat die Elementarladung?",
            "e = 1,6351892*10^(-12)As", "e = 1,6351892*10^(-12)C", "e = 1,6351892*10^(-19)As", "e = 1,6021892*10^(-19)As",
            "e = 1,6021892*10^(-19)As"
    );
    private Quiz derivationChargeQuiz2 = new Quiz(
            "Welches Formelzeichen hat die elektrische Ladung?",
            "F", "Q", "N", "E",
            "Q"
    );
    private Quiz derivationChargeQuiz3 = new Quiz(
            "Welche Formel dient zur Berechnung der elektrischen Ladung?",
            "Q = N/e", "Q = C/e", "Q = N*e", "Q = C*e",
            "Q = N*e"
    );
    private Quiz derivationChargeQuiz4 = new Quiz(
            "Welche Einheit hat die Ladung?",
            "N", "e", "As", "V",
            "As"
    );
    private Quiz derivationChargeQuiz5 = new Quiz(
            "Welche Einheit hat die Ladung?",
            "N", "C", "Q", "V",
            "C"
    );

    private String ionisation =
            "Durch Reibung, also beim zuführen von Energie, werden Ladungen übertagen.\n\n" +
            "Zum Beispiel: Ladungstrennung durch Ionisation beim Wasseratom H2O:\n" +
            "Ein Sauerstoffatom spaltet sich ab und übrig bleibt ein negativ geladenes Ion (Anion)  OH-\n" +
            "und ein positiv geladenes Ion (Kation)  H+.\n\n" +
            "Die Ladung im Gesamtgebiet bleibt dabei unverändert.";
    private Quiz ionisation1 = new Quiz(
            "Wie nennt man ein positiv geladenes Ion?",
            "Kation", "Proton", "Anion", "Positron",
            "Kation"
    );
    private Quiz ionisation2 = new Quiz(
            "Was bedeutet Ionisierung?",
            "Elektronen gehen Bindung mit Atomkern ein", "Protonen gehen Bindung mit Atomkern ein", "Elektronen entziehen sich der Bindung des Atomkerns", "Protonen entziehen sich der Bindung des Atomkerns",
            "Elektronen entziehen sich der Bindung des Atomkerns"
    );
    private Quiz ionisation3 = new Quiz(
            "Wie nennt man ein negativ geladenes Ion?",
            "Kation", "Proton", "Anion", "Positron",
            "Anion"
    );



    public ArrayList<Quiz> getAllQuizzes() {
        ArrayList<Quiz> quizList = new ArrayList<>();
        quizList.add(derivationChargeQuiz1);
        quizList.add(derivationChargeQuiz2);
        quizList.add(derivationChargeQuiz3);
        quizList.add(derivationChargeQuiz4);
        quizList.add(ionisation1);
        quizList.add(ionisation2);
        quizList.add(ionisation3);
        return quizList;
    }

    public List<Chunk> getChunkList(String content) {
        ArrayList<Chunk> chunkList = new ArrayList<>();
        Chunk chunk = new Chunk();
        ArrayList<Quiz> quizList = new ArrayList<>();

        switch (content) {
            case "Herleitung: Ladung":
                chunk.setText(derivationChargeText);
                quizList.add(derivationChargeQuiz1);
                quizList.add(derivationChargeQuiz2);
                quizList.add(derivationChargeQuiz3);
                quizList.add(derivationChargeQuiz4);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
                break;
            case "Ladungstrennung (Ionisation)":
                chunk.setText(ionisation);
                quizList.add(ionisation1);
                quizList.add(ionisation2);
                quizList.add(ionisation3);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
        }
        return chunkList;
    }

    public String getDerivationChargeText() {
        return this.derivationChargeText;
    }

    public void setDerivationChargeText(String derivationChargeText) {
        this.derivationChargeText = derivationChargeText;
    }

    public String getIonisation() {
        return this.ionisation;
    }

    public void setIonisation(String ionisation) {
        this.ionisation = ionisation;
    }

}
