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

    //----------- electrical charge ----------//

    private ArrayList<Chunk> chunk;

    private String derivationChargeText =
            "Protonen \\(e^+\\) sind positiv geladen \\(Q_p\\) und Elektronen \\(e^-\\) sind negativ geladen \\(Q_e\\). " +
            "Die Ladung beider Teilchen sind gleich groß, aber stets entgegengesetzt. $$$$" +
            "Das Formelzeichen für die Ladung ist \\(Q\\). $$$$" +
            "Die kleinste Ladung, also die eines Protons oder Elektrons wird Elementarladung \\(e\\) genannt und beträgt \\(e = 1,6021892·10^{-19}As\\). " +
            "Die Einheit der Elementarladung ist \\([e] = C\\) (Coulumb) \\(= As\\) (Amperesekunden) $$$$" +
            "Alle beobachtbaren Ladungen \\(Q\\) sind ein ganzzahliges Vielfaches der Elekrtonenladung \\(e\\): $$Q = N·e$$";

    private Quiz derivationChargeQuiz1 = new Quiz(
            "Welchen Wert hat die Elementarladung?",
            "\\(e = 1,6351892·10^{-12}As\\)", "\\(e = 1,6021892·10^{-12}C\\)", "\\(e = 1,6351892·10^{-19}As\\)", "\\(e = 1,6021892·10^{-19}As\\)",
            "\\(e = 1,6021892·10^{-19}As\\)"
    );

    private Quiz derivationChargeQuiz2 = new Quiz(
            "Welches Formelzeichen hat die elektrische Ladung?",
            "\\(F\\)", "\\(Q\\)", "\\(N\\)", "\\(E\\)",
            "\\(Q\\)"
    );

    private Quiz derivationChargeQuiz3 = new Quiz(
            "Welche Formel dient zur Berechnung der elektrischen Ladung?",
            "\\(Q = \\frac{N}{e}\\)", "\\(Q = \\frac{C}{e}\\)", "\\(Q = N·e\\)", "\\(Q = C·e\\)",
            "\\(Q = N·e\\)"
    );

    private Quiz derivationChargeQuiz4 = new Quiz(
            "Welche Einheit hat die Ladung?",
            "\\(N\\)", "\\(e\\)", "\\(As\\)", "\\(V\\)",
            "\\(As\\)"
    );

    private Quiz derivationChargeQuiz5 = new Quiz(
            "Welche Einheit hat die Ladung?",
            "\\(N\\)", "\\(C\\)", "\\(Q\\)", "\\(V\\)",
            "\\(C\\)"
    );

    private String ionisation =
            "Durch Reibung, also beim zuführen von Energie, werden Ladungen übertagen. " +
            "Zum Beispiel: Ladungstrennung durch Ionisation beim Wasseratom \\(H_2O\\) $$$$" +
            "Ein Sauerstoffatom spaltet sich ab und übrig bleibt ein negativ geladenes Ion (Anion)  \\(OH^-\\) " +
            "und ein positiv geladenes Ion (Kation)  \\(H^+\\). " +
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

    //----------- charge density ----------//

    private String lineChargeText =
            "Ladung kann in Linien, auf Flächen und im Raum berechnet werden. " +
            "Dabei können die Elektronen homogen (d.h. gleichmäßig) oder aber ortsunabhängig (ungleichmäßig) verteielt sein. " +
            "In der Regel sind die Ladungen ortsunabhängig verteilt.$$$$" +
            "Berechnung der Ladungsdichte auf einer \\mathbf{LINIE}:" +
            "homogen: $$λ = \\frac{Q}{l}$$" +
            "ortsunabhängig:  $$λ(s) = \\frac{dQ}{ds}$$ (ds entspricht dem Abschnitt, den wir betrachten wollen)$$$$" +
            "Einheit: $$[λ] = \\frac{As}{m}$$" +
            "Berechnung der Ladungsdichte auf einer \\mathbf{FLÄCHE}:" +
            "homogen: $$σ = \\frac{Q}{A}$$" +
            "ortsunabhängig: $$σ(A) = \\frac{dQ}{dA}$$" +
            "Einheit: $$[σ] = \\frac{As}{m^2}$$" +
            "Berechnung der Ladungsdichte in einem \\mathbf{RAUM}:" +
            "homogen: $$ρ = \\frac{Q}{V}$$" +
            "ortsunabhängig: $$ρ(V) = \\frac{dQ}{dV}$$" +
            "Einheit: $$[ρ] = \\frac{As}{m^3}$$";

    private Quiz lineChargeQuiz1 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladungsdichte auf einer Linie berechnen?",
            "\\(λ(s) = \\frac{\\mathrm{d}Q}{\\mathrm{d}s}\\)", "\\(λ(s) = \\frac{\\mathrm{d}s}{\\mathrm{d}Q}\\)", "\\(λ(Q) = \\frac{\\mathrm{d}Q}{\\mathrm{d}s}\\)", "\\(λ(Q) = \\frac{\\mathrm{d}s}{\\mathrm{d}Q}\\)",
            "\\(λ(s) = \\frac{\\mathrm{d}Q}{\\mathrm{d}s}\\)"
    );

    private Quiz lineChargeQuiz2 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladungsdichte auf einer Fläche berechnen?",
            "\\(σ(A) = \\frac{\\mathrm{d}Q}{\\mathrm{d}A}\\)", "\\(σ(Q) = \\frac{\\mathrm{d}Q}{\\mathrm{d}A}\\)", "\\(σ(A) = \\mathrm{d}Q·\\mathrm{d}A\\)", "\\(σ(Q) = \\mathrm{d}Q·\\mathrm{d}A\\)",
            "\\(σ(A) = \\frac{\\mathrm{d}Q}{\\mathrm{d}A}\\)"
    );

    private Quiz lineChargeQuiz3 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladungsdichte in einem Raum berechnen?",
            "\\(ρ(V) = \\frac{\\mathrm{d}Q}{\\mathrm{d}V}\\)", "\\(ρ(V) = \\frac{Q\\mathrm{d}}{V\\mathrm{d}}\\)", "\\(ρ(V) = \\frac{\\mathrm{d}V}{\\mathrm{d}Q}\\)", "\\(ρ(V) = \\frac{V\\mathrm{d}}{Q\\mathrm{d}}\\)",
            "\\(ρ(V) = \\frac{\\mathrm{d}Q}{\\mathrm{d}V}\\)"
    );

    private Quiz lineChargeQuiz4 = new Quiz(
            "Wie ist die Einheit der Linienladungsdichte?",
            "\\([λ] = \\frac{As}{m}\\)", "\\([λ] = \\frac{Q}{m}\\)", "\\([λ] = \\frac{m}{As}\\)", "\\([λ] = As\\)",
            "\\([λ] = \\frac{As}{m}\\)"
    );

    private Quiz lineChargeQuiz5 = new Quiz(
            "Wie ist die Einheit der Flächenladungsdichte?",
            "\\([σ] = \\frac{As}{m^2}\\)", "\\([σ] = \\frac{As}{m}\\)", "\\([σ] = \\frac{C}{m}\\)", "\\([σ] = \\frac{m}{As}\\)",
            "\\([σ] = \\frac{As}{m^2}\\)"
    );

    private Quiz lineChargeQuiz6 = new Quiz(
            "Wie ist die Einheit der Raumladungsdichte?",
            "\\([ρ] = \\frac{As}{m^3}\\)", "\\([ρ] = \\frac{m^3}{As}\\)", "\\(λ(Q) = \\frac{\\mathrm{d}Q}{\\mathrm{d}s}\\)", "\\(λ(Q) = \\frac{Q\\mathrm{d}}{V\\mathrm{d}}\\)",
            "\\([ρ] = \\frac{As}{m^3}\\)"
    );

    //----------- computation of charge density ----------//

    private String computationOfChargeDensityText =
            "Formel zur Berechnung der Linienladung:" +
            "$$Q = \\int_{l_1}^{l_2} \\! λ(s) \\, \\mathrm{d}s$$" +
            "Formel zur Berechnung der Flächenladung" +
            "$$Q = \\iint\\limits_A \\! σ(A) \\, \\mathrm{d}A$$" +
            "Formel zur Berechnung der Raumladung" +
            "$$Q = \\iiint\\limits_V \\! ρ(V) \\, \\mathrm{d}V$$";

    private Quiz computationOfChargeDensityQuiz1 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladung auf einer Fläche berechnen?",
            "\\(Q = \\iint\\limits_A \\! σ(A) \\, \\mathrm{d}A\\)", "\\(Q = \\int_{l_1}^{l_2} \\! λ(s) \\, \\mathrm{d}s\\)", "\\(Q = \\int\\limits_A \\! λ(A) \\, \\mathrm{d}A\\)", "\\(Q = \\iint\\limits_S \\! λ(s) \\, \\mathrm{d}s\\)",
            "\\(Q = \\iint\\limits_A \\! σ(A) \\, \\mathrm{d}A\\)"
    );

    private Quiz computationOfChargeDensityQuiz2 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladung auf einer Linie berechnen?",
            "\\(Q = \\int_{l_1}^{l_2} \\! λ(s) \\, \\mathrm{d}s\\)", "\\(Q = \\int_{l_1}^{l_2} \\! λ(s)\\)", "\\(Q = \\iint\\limits_S \\! s \\, \\mathrm{d}s\\)", "\\(Q = \\iint\\limits_S \\! λ(s) \\, \\mathrm{d}s\\)",
            "\\(Q = \\int_{l_1}^{l_2} \\! λ(s) \\, \\mathrm{d}s\\)"
    );

    private Quiz computationOfChargeDensityQuiz3 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladung in einem Raum berechnen?",
            "\\(Q = \\iiint\\limits_V \\! ρ(V) \\, \\mathrm{d}V\\)", "\\(Q = \\iiint\\limits_V \\! λ(V) \\, \\mathrm{d}V\\)", "\\(Q = \\iiint\\limits_V \\! σ(V) \\, \\mathrm{d}V\\)", "\\(Q = \\int\\limits_V \\! σ(V) \\, \\mathrm{d}V\\)",
            "\\(Q = \\iiint\\limits_V \\! ρ(V) \\, \\mathrm{d}V\\)"
    );

    //----------- load carrier in solid state ----------//

    private String loadCarrierInSolidStateText =
            "In Isolatoren sind alle Elektronen an Atome gebunden und können sich damit nicht quasi frei bewegen. " +
            "Elektronen der äußeren Orbitale sind nicht mehr einzelnen Atomen zugeordnet. " +
            "Diese, sich quasi frei bewegenden Elektronen, werden Valenzelektronen genannt. $$$$" +
            "Berechnung der Valenzelektronendichte n:" +
            "$$n = N_AZρ_mM_m^{-1}$$" +
            "$$N_A = 6,02214·10^{23} Atome/mol$$ $$N_A \\sim Avogadrokonstante$$" +
            "$$Z \\sim  Zahl \\; der \\; Valenzelektronen \\; pro \\; Atom$$" +
            "$$ρ_m \\sim  Materialdichte \\; in \\; \\frac{g}{cm^3}$$" +
            "$$M_m \\sim  molare \\; Masse \\; in \\; \\frac{g}{mol}$$" +
            "Berechnung der Raumladungsdichte über Valenzelektronen:" +
            "$$ρ = \\frac{dQ}{dV} = -e·n$$";

    private Quiz loadCarrierInSolidStateQuiz1 = new Quiz(
            "Mit welcher Formel lässt sich die Valenzelektronendichte berechnen?",
            "\\(n = N_AZρ_mM_m^{-1}\\)", "\\(n = N_Aeρ_mM_m^{-1}\\)", "\\(n = N_AZM_mρ_m^{-1}\\)", "\\(n = N_AeM_mρ_m^{-1}\\)",
            "\\(n = N_AZρ_mM_m^{-1}\\)"
    );

    private Quiz loadCarrierInSolidStateQuiz2 = new Quiz(
            "Welchen Wert hat die Avogadrokonstante?",
            "\\(N_A = 6,02214·10^{23}\\)", "\\(N_A = 7,83304·10^{23}\\)", "\\(N_A = 6,02214·10^{-32}\\)", "\\(N_A = 7,83304·10^{-32}\\)",
            "\\(N_A = 6,02214·10^{23}\\)"
    );

    private Quiz loadCarrierInSolidStateQuiz3 = new Quiz(
            "Mit welcher Formel lässt sich die Raumladungsdichte brechnen?",
            "\\(ρ = -e·n\\)", "\\(ρ = e·n\\)", "\\(ρ = \\frac{-e}{n}\\)", "\\(ρ = \\frac{e}{n}\\)",
            "\\(ρ = -e·n\\)"
    );

    //----------- coulomb's law ----------//

    String derivationCoulombsLawText =
            "Die Kraft \\(F\\) ist betragsmäßig proportoinal zwischen zwei Ladungen und umgekehrt proprtional zum Quadrat des Abstandes \\(r\\)." +
                    "$$F \\sim \\frac{Q_1Q_2}{r^2}$$" +
                    "Mit der Proportionalitätskonstanten \\(\\frac{1}{4πε_0}\\) ergibt sich" +
                    "$$F = \\frac{1}{4πε_0}\\frac{Q_1Q_2}{r^2}    (im Vakuum)$$" +
                    "$$ε_0 = 8,854·10^{-12}\\frac{As}{Vm}$$" +
                    "\\(ε_0\\) ist die elektrische Feldkonstante (auch Dielekrtizitätskonstante genannt). " +
                    "Nun fehlt noch die Richtung in die die Kraft wirkt als Einheitsvektor von Punktladung \\(Q_1\\) zur Punktladung \\(Q_2\\) zeigt. Das heißt die Kraft wirkt von \\(Q_2\\) auf \\(Q_1\\)." +
                    "$$\\vec{F} = \\frac{1}{4πε_0} \\frac{Q_1Q_2}{|\\vec{r}_1-\\vec{r}_2|^2} \\vec{e}_{12}$$" +
                    "$$\\vec{e}_{12} = \\frac{\\vec{r}_1-\\vec{r}_2}{|\\vec{r}_1-\\vec{r}_2|}$$" +
                    "$$\\vec{F} = \\frac{1}{4πε_0}\\frac{Q_1Q_2}{r^2}\\vec{e}_r$$" +
                    "Die Eineit der Proportionalitätskonstanten ist:" +
                    "$$[ε_0] = \\frac{[Q^2]}{[r^2]·[F]}=\\frac{A²s²}{m²N} = \\frac{As}{Vm}$$" +
                    "$$1Ws = 1V·As = 1Nm$$";

    private Quiz derivationCoulombsLawQuiz1 = new Quiz(
            "Was beschreibt das Coulomb'sche Gesetz?",
            "Kraftwirkung zwischen zwei Punktladungen", "gerichtete Bewegung von Ladungen", "Abstoßen gleicher Ladungen und anziehen ungleicher Ladungen", "Strom fließt immer vom positivem Pol des Spannungserzeugers über den Verbraucher zum negativem Pol",
            "Kraftwirkung zwischen zwei Punktladungen"
    );

    private Quiz derivationCoulombsLawQuiz2 = new Quiz(
            "Welche Formel dient zur Berechnung der Kraft zwischen zwei Punktladungen?",
            "\\(\\vec{F} = \\frac{1}{4πε_0} \\frac{Q_1Q_2}{r^2} · \\vec{e_r}\\)", "\\(\\vec{F} = \\frac{1}{4πε_0}Q_1Q_2 · \\vec{e_r}\\)", "\\(\\vec{F} = \\frac{4}{πε_0} \\frac{Q_1Q_2}{r^2} · \\vec{e_r}\\)", "\\(\\vec{F} = \\frac{1}{4πr^2}Q_1Q_2 · \\vec{e_r}\\)",
            "\\(\\vec{F} = \\frac{1}{4πε_0} \\frac{Q_1Q_2}{r^2} · \\vec{e_r}\\)"
    );

    private Quiz derivationCoulombsLawQuiz3 = new Quiz(
            "Welche Einheit hat die Coulombkraft?",
            "\\(N\\)", "\\(As\\)", "\\(\\frac{As}{Vm}\\)", "\\(Nm\\)",
            "\\(N\\)"
    );

    private Quiz derivationCoulombsLawQuiz4 = new Quiz(
            "Welche Einheit hat die Proportionalitätskonstante?",
            "\\(\\frac{As}{Vm}\\)", "\\(As\\)", "\\(N\\)", "\\(Nm\\)",
            "\\(\\frac{As}{Vm}\\)"
    );

    private Quiz derivationCoulombsLawQuiz5 = new Quiz(
            "Welche Formel dient zur Berechnung des Coulomb'schen Gesetzes?",
            "\\(\\vec{F} = \\frac{1}{4πε_0} \\frac{Q_1Q_2}{r^2} · \\vec{e_r}\\)", "\\(Q = N·e\\)", "\\(n = N_AZρ_mM_m^{-1}\\)", "\\(U = R·I\\)",
            "\\(\\vec{F} = \\frac{1}{4πε_0} \\frac{Q_1Q_2}{r^2} · \\vec{e_r}\\)"
    );

    private String multiplesForceActionText =
            "Die Ladungen mit Index \\(i\\) wirken auf die Ladung mit dem Index \\(n\\). " +
                    "$$\\vec{F}_{n,i} = \\frac{Q_nQ_i}{4πε_0r_{n,i}^2} \\vec{e}_{r(n,i)}$$ " +
                    "= Summe aller Teilkräfte auf Ladung \\(Q_n\\): " +
                    "$$\\vec{F}_n = \\sum_{i=1}^{n-1}\\vec{F}_{n,i}$$" +
                    "Die der Kräfte aller Ladungen ist \\(0\\). $$$$" +
                    "Überlagerungssatz: " +
                    "$$\\vec{F}_n = \\frac{Q_n}{4πε_0} \\sum{\\frac{Q_i}{r_{i,n}^2}} \\vec{e}_{r(n,i)}$$";

    private Quiz multiplesForceActionQuiz1 = new Quiz(
            "Wie lautet das Überlagerungsgesetz?",
            "\\(\\vec{F}_n = \\frac{Q_n}{4πε_0} \\sum{\\frac{Q_i}{r_{n,i}^2}} \\vec{e}_{r(n,i)}\\)", "\\(\\vec{F}_n = \\frac{Q_n}{4πε_0} \\sum{\\frac{Q_i}{r_{i,n}^2}} \\vec{e}_{r(i,n)}\\)", "\\(\\vec{F}_n = \\frac{Q_n}{4πε_0} \\sum{\\frac{Q_i}{r_{n,i}^2}} \\vec{e}_{r(i,n)}\\)", "\\(\\vec{F}_n = \\frac{Q_n}{4πε_0} \\sum{\\frac{Q_i}{r_{i,n}^2}} \\vec{e}_{r(i,n)}\\)",
            "\\(\\vec{F}_n = \\frac{Q_n}{4πε_0} \\sum{\\frac{Q_i}{r_{n,i}^2}} \\vec{e}_{r(n,i)}\\)"
    );


    private Quiz multiplesForceActionQuiz2 = new Quiz(
            "Worauf wirkt die Kraft bei der Formel \\(\\vec{F}_{i,j} = \\frac{1}{4πε_0} \\frac{Q_iQ_j}{r_{i,j}}^2 \\vec{e_{r(i,j)}}\\)?",
            "auf \\(Q_i\\)", "auf \\(Q_j\\)", "Senkrecht zur Geraden durch \\(Q_i\\) und \\(Q_n\\)", "es wirkt keine Kraft",
            "auf \\(Q_i\\)"
    );

    private Quiz multiplesForceActionQuiz3 = new Quiz(
            "Welche Ladung verursacht die Kraft bei der Formel \\(\\vec{F}_{i,j} = \\frac{1}{4πε_0} \\frac{Q_iQ_j}{r_{i,j}}^2 \\vec{e_{r(i,j)}}\\)?",
            "\\(Q_j\\)", "\\(Q_i\\)", "beide Ladungen", "es wirkt keine Kraft",
            "\\(Q_j\\)"
    );

    //----------- extra quiz questions ----------//

    private Quiz electricCurrentQuiz = new Quiz(
            "Was verseht man unter elektrischem Strom?",
            "gerichtete Bewegung von Ladungen", "gerichtete Bewegung von Atomen", "Ionisierung von Atomen", "Abstoßen gleicher Ladungen und anziehen ungleicher Ladungen",
            "gerichtete Bewegung von Ladungen"
    );


    public ArrayList<Chunk> getChunkList(String content) {
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
                break;
            case "Linienladung":
                chunk.setText(lineChargeText);
                quizList.add(lineChargeQuiz1);
                quizList.add(lineChargeQuiz2);
                quizList.add(lineChargeQuiz3);
                quizList.add(lineChargeQuiz4);
                quizList.add(lineChargeQuiz5);
                quizList.add(lineChargeQuiz6);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
                break;
            case "Berechnung von Ladungsdichten":
                chunk.setText(computationOfChargeDensityText);
                quizList.add(computationOfChargeDensityQuiz1);
                quizList.add(computationOfChargeDensityQuiz2);
                quizList.add(computationOfChargeDensityQuiz3);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
                break;
            case "Ladungsträger im Festkörper":
                chunk.setText(loadCarrierInSolidStateText);
                quizList.add(loadCarrierInSolidStateQuiz1);
                quizList.add(loadCarrierInSolidStateQuiz2);
                quizList.add(loadCarrierInSolidStateQuiz3);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
                break;
            case "Herleitung: Coulomb'sches Gesetz":
                chunk.setText(derivationCoulombsLawText);
                quizList.add(derivationCoulombsLawQuiz1);
                quizList.add(derivationCoulombsLawQuiz2);
                quizList.add(derivationCoulombsLawQuiz3);
                quizList.add(derivationCoulombsLawQuiz4);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
                break;
            case "Mehrfache Kraftwirkung auf eine Punktladung":
                chunk.setText(multiplesForceActionText);
                quizList.add(multiplesForceActionQuiz1);
                quizList.add(multiplesForceActionQuiz2);
                quizList.add(multiplesForceActionQuiz3);
                chunk.setQuiz(quizList);
                chunkList.add(chunk);
                break;
        }
        return chunkList;
    }

    public ArrayList<Quiz> getAllQuizzes() {
        ArrayList<Quiz> quizList = new ArrayList<>();
        quizList.add(derivationChargeQuiz1);
        quizList.add(derivationChargeQuiz2);
        quizList.add(derivationChargeQuiz3);
        quizList.add(derivationChargeQuiz4);
        quizList.add(derivationChargeQuiz5);
        quizList.add(ionisation1);
        quizList.add(ionisation2);
        quizList.add(ionisation3);
        quizList.add(lineChargeQuiz1);
        quizList.add(lineChargeQuiz2);
        quizList.add(lineChargeQuiz3);
        quizList.add(lineChargeQuiz4);
        quizList.add(lineChargeQuiz5);
        quizList.add(lineChargeQuiz6);
        quizList.add(computationOfChargeDensityQuiz1);
        quizList.add(computationOfChargeDensityQuiz2);
        quizList.add(computationOfChargeDensityQuiz3);
        quizList.add(loadCarrierInSolidStateQuiz1);
        quizList.add(loadCarrierInSolidStateQuiz2);
        quizList.add(loadCarrierInSolidStateQuiz3);
        quizList.add(derivationCoulombsLawQuiz1);
        quizList.add(derivationCoulombsLawQuiz2);
        quizList.add(derivationCoulombsLawQuiz3);
        quizList.add(derivationCoulombsLawQuiz4);
        quizList.add(derivationCoulombsLawQuiz5);
        quizList.add(multiplesForceActionQuiz1);
        quizList.add(multiplesForceActionQuiz2);
        quizList.add(multiplesForceActionQuiz3);
        quizList.add(electricCurrentQuiz);
        return quizList;
    }
}
