public class Main {
    public static void main(String[] args){

        // Voertuigen en punten toevoegen aan alle voertuigen
        Voertuig Auto = new Voertuig("Auto", 001, 1.0);
        Voertuig Fiets = new Voertuig("Fiets", 002, 2.0);
        Voertuig Lopend = new Voertuig("Lopen", 003, 2.0);
        Voertuig OpenbaarVervoer = new Voertuig("OpenbaarVervoer", 004, 1.5);
        Voertuig Scooter = new Voertuig("Scooter", 005, 1.2);
        Voertuig.AlleVoertuigen.add(Auto);
        Voertuig.AlleVoertuigen.add(Fiets);
        Voertuig.AlleVoertuigen.add(Lopend);
        Voertuig.AlleVoertuigen.add(OpenbaarVervoer);
        Voertuig.AlleVoertuigen.add(Scooter);
    }
}
