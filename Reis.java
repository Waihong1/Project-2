import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Reis {
    public static Scanner scanner = new Scanner(System.in);

    private String ReisNaam;    //ReisNaam bijv huis naar school
    private Integer ReisTijd;   //ReisTijd in Minuten
    private String DatumReis;   //Datum als 16-05-2022
    private Long TijdVertrek;   //Tijd als 18.30 (half 7)

    ArrayList<Voertuig> GebruikteVoertuigen = new ArrayList<>();

    public Reis(String ReisNaam, Integer ReisTijd, String DatumReis, Long TijdVertrek){
        this.ReisNaam = ReisNaam;
        this.ReisTijd = ReisTijd;
        this.DatumReis = DatumReis;
        this.TijdVertrek = TijdVertrek;
    }

    public void TotalePuntenReis(){
    }

}

