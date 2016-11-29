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

    private ArrayList<Chunk> chunk;

    private String derivationChargeText =
            "Protonen (e+) sind positiv geladen Qp und Elektronen (e-) sind negativ geladen Qe. \n\n" +
            "Die Ladung beider Teilchen ist gleich groß, aber stets entgegengesetzt.\n\n" +
            "Das Formelzeichen für die Ladung ist Q.\n\n" +
            "Die kleinste Ladung, also die eines Protons oder Elektrons wird Elementarladung e genannt und beträgt e=1,6021892*10^19 As." +
            "Die Einheit der Elementarladung ist [e] = C (Coulumb) = As (Amperesekunden)\n\n" +
            "Alle beobachtbaren Ladungen Q sind ein ganzzahliges Vielfaches der Elekrtonenladung e\n" +
            "      Q = N*e";

    private Quiz derivationChargeQuiz1 = new Quiz(
            "Was stimmt für die Elemtarladung?",
            "answer1", "answer2", "answer3", "answer4",
            "answer2"
    );

    private Quiz derivationChargeQuiz2 = new Quiz(
            "Was stimmt für die elektrische Ladung?",
            "option1", "option2", "option3", "option4",
            "option3"
    );

    private String derivationChargeText2 = "Elon Musk rocks";

    private Quiz derivationChargeQuiz21 = new Quiz(
            "Wat is denn los mit dir?",
            "nichts", "Ich bin der Boss!", "Gegenfrage, wat is denn los mit dir?", "Lass den Boss zufrieden!",
            "Ich bin der Boss!"
    );

    public String getTextContent() {
        return derivationChargeText;
    }

    public ArrayList<Chunk> getChunkList() {
        ArrayList<Chunk> chunkList = new ArrayList<>();
        Chunk chunk = new Chunk();
        ArrayList<Quiz> quizList = new ArrayList<>();

        chunk.setText(derivationChargeText);
        quizList.add(derivationChargeQuiz1);
        quizList.add(derivationChargeQuiz2);
        chunk.setQuiz(quizList);
        chunkList.add(chunk);

        Chunk chunk2 = new Chunk();
        ArrayList<Quiz> quizList2 = new ArrayList<>();
        chunk2.setText(derivationChargeText2);
        quizList2.add(derivationChargeQuiz21);
        chunk2.setQuiz(quizList2);
        chunkList.add(chunk2);

        return chunkList;
    }
}
