import java.util.ArrayList;

public class Voertuig {

    private String TypeVoertuig;    //Auto, Fiets, Lopend, OV, Scooter
    private Integer VoertuigID;     //001, 002, 003, 004, 005
    private Double VoertuigPunten;  //VoertuigPunten is punten per minuut

    public static ArrayList<Voertuig> AlleVoertuigen = new ArrayList<>();


    public Voertuig(String TypeVoertuig, Integer VoertuigID, Double VoertuigPunten) {
        this.TypeVoertuig = TypeVoertuig;
        this.VoertuigID = VoertuigID;
        this.VoertuigPunten = VoertuigPunten;
    }


}
