public class Pracownik extends Osoba {
    private String stanowisko;
    private int pensja;

    public Pracownik(String imie, String nazwisko, String stanowisko, int pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }
}
