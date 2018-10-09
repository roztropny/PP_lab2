import java.util.ArrayList;

public class Firma {
    private String nazwa;
    private ArrayList<Pracownik> pracownicy;

    public Firma(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajPracownika(Pracownik pracownik){
        this.pracownicy.add(pracownik);
    }

    public void dodajPracownikow(ArrayList<Pracownik> pracownicy){
        for (Pracownik pracownik : pracownicy){
            this.dodajPracownika(pracownik);
        }
    }
}
