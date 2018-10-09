public class Pracownik extends Osoba {
    private Stanowisko stanowisko;
    private int pensja;

    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, int pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Stanowisko getStanowisko(){
        return this.stanowisko;
    }

    public int getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                super.toString() +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
