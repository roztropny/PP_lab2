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

    public int getPracownicySize(){
        return this.pracownicy.size();
    }

    @Override
    public String toString() {
        String pracownicy = new String();
        for (Pracownik pracownik : this.pracownicy){
            pracownicy += pracownik.toString() + ',';
        }
        pracownicy = pracownicy.substring(0, pracownicy.length() - 1);
        return "Firma{" +
                "nazwa='" + this.nazwa + '\'' +
                ", pracownicy[" + pracownicy + ']' +
                '}';
    }
}
