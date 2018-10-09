public enum Stanowisko {
    DYREKTOR(1, "Dyrektor"),
    KIEROWNIK(2, "Kierownik"),
    ROBOTNIK(3, "Robotnik");

    private int hierarchia;
    private String opis;

    private Stanowisko(int hierarchia, String opis) {
        this.hierarchia = hierarchia;
        this.opis = opis;
    }

    public String getOpis() {
        return this.opis;
    }

    public int getHierarchia(){
        return this.hierarchia;
    }
}