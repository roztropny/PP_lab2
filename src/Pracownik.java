public class Pracownik extends Osoba {
    private String stanowisko;
    private int pensja;

    public Pracownik(String imie, String nazwisko, String stanowisko, int pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                super.toString() +
                "stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }
}
