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
            "Protonen e⁺ sind positiv geladen Qp und Elektronen e⁻ sind negativ geladen Qe. \n\n" +
            "Die Ladung beider Teilchen ist gleich groß, aber stets entgegengesetzt.\n\n" +
            "Das Formelzeichen für die Ladung ist Q.\n\n" +
            "Die kleinste Ladung, also die eines Protons oder Elektrons wird Elementarladung e genannt und beträgt e=1,6021892·10⁻¹⁹ As." +
            "Die Einheit der Elementarladung ist [e] = C (Coulumb) = As (Amperesekunden)\n\n" +
            "Alle beobachtbaren Ladungen Q sind ein ganzzahliges Vielfaches der Elekrtonenladung e: Q = N·e";

    private Quiz derivationChargeQuiz1 = new Quiz(
            "Welchen Wert hat die Elementarladung?",
            "e = 1,6351892·10⁻¹²As", "e = 1,6021892·10⁻¹²C", "e = 1,6351892·10⁻¹⁹As", "e = 1,6021892·10⁻¹⁹As",
            "e = 1,6021892·10⁻¹⁹As"
    );

    private Quiz derivationChargeQuiz2 = new Quiz(
            "Welches Formelzeichen hat die elektrische Ladung?",
            "F", "Q", "N", "E",
            "Q"
    );

    private Quiz derivationChargeQuiz3 = new Quiz(
            "Welche Formel dient zur Berechnung der elektrischen Ladung?",
            "Q = N/e", "Q = C/e", "Q = N·e", "Q = C·e",
            "Q = N·e"
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
            "Zum Beispiel: Ladungstrennung durch Ionisation beim Wasseratom H2O\n" +
            "Ein Sauerstoffatom spaltet sich ab und übrig bleibt ein negativ geladenes Ion (Anion)  OH⁻\n" +
            "und ein positiv geladenes Ion (Kation)  H⁺.\n\n" +
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
            "Ladung kann in Linien, auf Flächen und im Raum berechnet werden.\n" +
            "Dabei können die Elektronen homogen (d.h. gleichmäßig) oder aber ortsunabhängig (ungleichmäßig) verteielt sein.\n" +
            "In der Regel sind die Ladungen ortsunabhängig verteilt.\n\n" +
            "Berechnung der Ladungsdichte auf einer LINIE:\n\n" +
            "homogen: λ = Q / l\n" +
            "ortsunabhängig:  λ(s) = dQ / ds (ds entspricht dem Abschnitt, den wir betrachten wollen)\n" +
            "Einheit: [λ] = As/m\n\n" +
            "Berechnung der Ladungsdichte auf einer FLÄCHE:\n\n" +
            "homogen: σ = Q / A\n" +
            "ortsunabhängig: σ(A) = dQ / dA\n" +
            "Einheit: [σ] = As/m²\n\n" +
            "Berechnung der Ladungsdichte in einem RAUM:\n\n" +
            "homogen: ρ = Q / V\n" +
            "ortsunabhängig: ρ(V) = dQ / dV\n" +
            "Einheit: [ρ] = As/m³";

    private Quiz lineChargeQuiz1 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladungsdichte auf einer Linie berechnen?",
            "λ(s) = dQ / ds", "λ(s) = ds / dQ", "λ(Q) = dQ / ds", "λ(Q) = ds / dQ",
            "λ(s) = dQ / ds"
    );

    private Quiz lineChargeQuiz2 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladungsdichte auf einer Fläche berechnen?",
            "σ(A) = dQ / dA", "σ(Q) = dQ / dA", "σ(A) = dQ · dA", "σ(Q) = dQ · dA",
            "σ(A) = dQ / dA"
    );

    private Quiz lineChargeQuiz3 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladungsdichte in einem Raum berechnen?",
            "ρ(V) = dQ / dV", "ρ(V) = Qd / Vd", "ρ(V) = dV / dQ", "ρ(V) = Vd / Qd",
            "ρ(V) = dQ / dV"
    );

    private Quiz lineChargeQuiz4 = new Quiz(
            "Wie ist die Einheit der Linienladungsdichte?",
            "[λ] = As/m", "[λ] = Q/m", "[λ] = m/As", "[λ] = As",
            "[λ] = As/m"
    );

    private Quiz lineChargeQuiz5 = new Quiz(
            "Wie ist die Einheit der Flächenladungsdichte?",
            "[σ] = As/m²", "[σ] = As/m", "[σ] = C/m", "[σ] = m/As",
            "[σ] = As/m²"
    );

    private Quiz lineChargeQuiz6 = new Quiz(
            "Wie ist die Einheit der Raumladungsdichte?",
            "[ρ] = As/m³", "[ρ] = m³/As", "λ(Q) = dQ / ds", "λ(Q) = Qd / Vd",
            "[ρ] = As/m³"
    );

    //----------- computation of charge density ----------//

    private String computationOfChargeDensityText =
            "Da noch kein Latex integriert ist und desshalb das Integralzeichen noch nicht korrekt dargestellt werden kann, wird solange ersatzweise S als Integralzeichen verwendendet.\n\n\n" +
            "Formel zur Berechnung der Linienladung:\n" +
            "Q = S(λ(s))ds  mit den Grenzen l1 und l2\n\n" +
            "Formel zur Berechnung der Flächenladung\n" +
            "Q = SS(σ(A))dA  wobei über A integriet wird\n\n" +
            "Formel zur Berechnung der Raumladung\n" +
            "Q = SSS(ρ(V))dV  wbei über V integriert wird";

    private Quiz computationOfChargeDensityQuiz1 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladung auf einer Fläche berechnen?",
            "Q = SS(σ(A))dA", "Q = S(σ(s))ds", "Q = S(λ(A))dA", "Q = SS(λ(s))ds",
            "Q = SS(σ(A))dA"
    );

    private Quiz computationOfChargeDensityQuiz2 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladung auf einer Linie berechnen?",
            "Q = S(λ(s))ds", "Q = S(λ(s))", "Q = SS(s)ds", "Q = SS(λ(s))ds",
            "Q = S(λ(s))ds"
    );

    private Quiz computationOfChargeDensityQuiz3 = new Quiz(
            "Mit welcher Formel lässt sich die ortsunabhängige Ladung in einem Raum berechnen?",
            "Q = SSS(ρ(V))dV", "Q = S(λ(V))dV", "Q = SSS(σ(V))dV", "Q = S(σ(V))dV",
            "Q = SSS(ρ(V))dV"
    );

    //----------- load carrier in solid state ----------//

    private String loadCarrierInSolidStateText =
            "In Isolatoren sind alle Elektronen an Atome gebunden und können sich damit nicht quasi frei bewegen.\n\n" +
            "Elektronen der äußeren Orbitale sind nicht mehr einzelnen Atomen zugeordnet.\n" +
            "Diese, sich quasi frei bewegenden Elektronen, werden Valenzelektronen genannt.\n\n" +
            "Berechnung der Valenzelektronendichte n:\n\n" +
            "n = NA·Z·ρm·Mm⁻¹\n\n" +
            "NA = 6,02214·10²³ Atome/mol … Avogadrokonstante\n" +
            "Z … Zahl der Valenzelektronen pro Atom\n" +
            "ρm … Materialdichtein g/cm³\n" +
            "Mm … molare Masse in g/mol\n\n\n" +
            "Berechnung der Raumladungsdichte über Valenzelektronen:\n\n" +
            "ρ = dQ/dV = -e·n";

    private Quiz loadCarrierInSolidStateQuiz1 = new Quiz(
            "Mit welcher Formel lässt sich die Valenzelektronendichte berechnen?",
            "n = NA·Z·ρm·Mm⁻¹", "n = NA·e·ρm·Mm", "n = NA·Z·Mm·ρm⁻¹", "n = NA·e·Mm·ρm⁻¹",
            "n = NA·Z·ρm·Mm⁻¹"
    );

    private Quiz loadCarrierInSolidStateQuiz2 = new Quiz(
            "Welchen Wert hat die Avogadrokonstante?",
            "NA = 6,02214·10²³", "NA = 7,83304·10²³", "NA = 6,02214·10⁻³²", "NA = 7,83304·10³²",
            "NA = 6,02214·10²³"
    );

    private Quiz loadCarrierInSolidStateQuiz3 = new Quiz(
            "Mit welcher Formel lässt sich die Raumladungsdichte brechnen?",
            "ρ = -e·n", "ρ = e·n", "ρ = -e/n", "ρ = e/n",
            "ρ = -e·n"
    );

    //----------- coulomb's law ----------//

    private String derivationCoulombsLawText =
            "Die Kraft F ist betragsmäßig proportoinal zwischen zwei Ladungen und umgekehrt proprtional zum Quadrat des Abstandes r.\n\n" +
                    "F ~ Q1·Q2/r²\n\n" +
                    "Mit der Proportionalitätskonstanten 1/(4πε0) ergibt sich\n\n" +
                    "F = 1/(4πε0) · Q1·Q2/r²  (im Vakuum)\n\n" +
                    "ε0 = 8,854·10⁻¹² As/Vm … elektrische Feldkonstante (auch Dielekrtizitätskonstante)\n\n" +
                    "Nun fehlt noch die Richtung der Kraft die mit einem Einheitsvektor von Punktladung Q1 zur Punktladung Q2 zeigt. Das heißt die Kraft wirkt von Q2 auf Q1.\n\n" +
                    "vec{F} = 1/(4·π·ε0) · Q1·Q2/|vec{r1}-vec{r2}|² · vec{e12}\n" +
                    "vec{e12} = vec{r1}-vec{r2} / |vec{r1}-vec{r2}|" +
                    "vec{F} = 1/(4·π·ε0) · Q1·Q2/r² · vec{er}\n\n" +
                    "Die Eineit der Proportionalitätskonstanten ist:" +
                    "[ε0] = [Q²] / [r²]·[F] = A²·s²/m²N = As/Vm\n\n" +
                    "1Ws = 1VAs = 1Nm";

    private Quiz derivationCoulombsLawQuiz1 = new Quiz(
            "Was beschreibt das Coulomb'sche Gesetz?",
            "Kraftwirkung zwischen zwei Punktladungen", "gerichtete Bewegung von Ladungen", "Abstoßen gleicher Ladungen und anziehen ungleicher Ladungen", "Strom fließt immer vom positivem Pol des Spannungserzeugers über den Verbraucher zum negativem Pol",
            "Kraftwirkung zwischen zwei Punktladungen"
    );

    private Quiz derivationCoulombsLawQuiz2 = new Quiz(
            "Welche Formel dient zur Berechnung der Kraft zwischen zwei Punktladungen?",
            "vec{F} = 1/(4·π·ε0) · Q1·Q2/r² · vec{er}", "vec{F} = 1/(4·π·r²) · Q1·Q2 · vec{er}", "vec{F} = 4/(π·ε0) · Q1·Q2/r² · vec{er}", "vec{F} = 1/(4·π·ε0) · Q1·Q2 · vec{er}",
            "vec{F} = 1/(4·π·ε0) · Q1·Q2/r² · vec{er}"
    );

    private Quiz derivationCoulombsLawQuiz3 = new Quiz(
            "Welche Einheit hat die Coulombkraft?",
            "N", "As", "As/Vm", "Nm",
            "N"
    );

    private Quiz derivationCoulombsLawQuiz4 = new Quiz(
            "Welche Einheit hat die Proportionalitätskonstante?",
            "As/Vm", "As", "N", "Nm",
            "As/Vm"
    );

    private Quiz derivationCoulombsLawQuiz5 = new Quiz(
            "Welche Formel dient zur Berechnung des Coulomb'schen Gesetzes?",
            "vec{F} = 1/(4·π·ε0) · Q1·Q2/r² · vec{er}", "Q = N·e", "n = NA·Z·ρm·Mm⁻¹", "U = R·I",
            "vec{F} = 1/(4·π·ε0) · Q1·Q2/r² · vec{er}"
    );

    private String multiplesForceActionText =
            "Die Ladungen mit Index i wirken auf die Ladung mit dem Index n.\n\n" +
                    "vec{Fn,i} = Qn·Qi / 4·π·ε0·rn,i² vec{ern,i}\n\n" +
                    "= Summe aller Teilkräfte auf Ladung Qn:\n\n" +
                    "vec{Fn} = Σ(vec{Fn,i}) von i=1 bis n-1\n\n\n" +
                    "Die der Kräfte aller Ladungen ist 0.\n\n" +
                    "Überlagerungssatz:\n\n" +
                    "vec{Fn} = Qn/4·π·ε0 · Σ(Qi/ri,n²) · vec{eri,n}";

    private Quiz multiplesForceActionQuiz1 = new Quiz(
            "Wie lautet das Überlagerungsgesetz?",
            "vec{Fn} = Qn/4·π·ε0 · Σ(Qi/ri,n²) · vec{eri,n}", "vec{Fn} = Qn/4·π·ε0 · Σ(Qi/ri,n²) · vec{ern,i}", "vec{Fn} = Qn/4·π·ε0 · Qi/ri,n² · vec{eri,n}", "vec{Fn} = Qn/4·π·ε0 · Σ(Qi/rn,i²) vec{eri,n}",
            "vec{Fn} = Qn/4·π·ε0 · Σ(Qi/ri,n²) · vec{eri,n}"
    );


    private Quiz multiplesForceActionQuiz2 = new Quiz(
            "Worauf wirkt die Kraft bei der Formel vec{Fi,j} = 1/4·π·ε0 · Qi·Qj/ri,n² · vec{eri,n}?",
            "auf Qi", "auf Qj", "Senkrecht zur Geraden durch Q1 und Q2", "es wirkt keine Kraft",
            "auf Qi"
    );

    private Quiz multiplesForceActionQuiz3 = new Quiz(
            "Welche Ladung verursacht die Kraft bei der Formel vec{Fi,j} = 1/4·π·ε0 · Qi·Qj/ri,n² · vec{eri,n}?",
            "Qj", "Qi", "beide Ladungen", "es wirkt keine Kraft",
            "Qj"
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
