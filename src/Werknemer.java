package src;

import java.util.ArrayList;
import java.util.Collections;

public class Werknemer {
    String naam; // naam van de werknemer
    double totaal; // totale punten van de werknemer over alles.
    ArrayList<Werknemer> werknemerArrayList = new ArrayList<>(); // ArrayList van werknemers
    double dailyTotaal; // dagelijkse totale punten

    public Werknemer(String naam, double dailyTotaal) {
        this.naam = naam;
        this.dailyTotaal= dailyTotaal;


    }

    public void eigenRangLijst(ArrayList werknemerArrayList) {
        for (Object i : werknemerArrayList) {
            Collections.sort(werknemerArrayList);
            System.out.println(i);
        }

    }
    public double totalDailyPointsUpdate(double dailyTotaal){
        double totale = totaal + dailyTotaal;
        return  totale;

    }



}


