public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("aaa");
        firma.dodajPracownika(new Pracownik("Harrison", "Ford", Stanowisko.KIEROWNIK, 1000));
        firma.dodajPracownika(new Pracownik("Bill", "Gates", Stanowisko.DYREKTOR, 10000));
        System.out.println(firma.toString());
        System.out.println("1 "+firma.pracownicyPensjaSuma());
        System.out.println("2 "+firma.pracownicyPensjaSrednia());
        System.out.println("3 "+firma.pracownicyPensjaSumaPerStanowisko(Stanowisko.DYREKTOR));
        System.out.println("4 "+firma.pracownicyPensjaSredniaPerStanowisko(Stanowisko.DYREKTOR));
        System.out.println("5 "+firma.getPracownicySizePerStanowisko(Stanowisko.DYREKTOR));

    }
}
