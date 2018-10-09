public class Stanowisko {
    public enum nazwa {
        ABC, DEF, GHI
    }

    public enum hierarchia {
        DYREKTOR, KIEROWNIK
    }

    private final String opis;

    public Stanowisko(String opis) {
        this.opis = opis;
    }
}