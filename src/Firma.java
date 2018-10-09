import java.util.ArrayList;
import java.util.Iterator;

public class Firma implements Iterable<Pracownik>{
    private String nazwa;
    private ArrayList<Pracownik> pracownicy;

    public Firma(String nazwa) {
        this.nazwa = nazwa;
        this.pracownicy = new ArrayList<>();
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

    public int getPracownicySizePerStanowisko(Stanowisko stanowisko){
        int i = 0;
        Iterator<Pracownik> iteratorP = this.iterator(stanowisko);
        while(iteratorP.hasNext()) {
            iteratorP.next();
            i++;
        }
        return i;
    }

    public double pracownicyPensjaSuma() {
        double pensje = 0;
        for(Pracownik pracownik : this) {
            pensje += pracownik.getPensja();
        }
        return pensje;
    }

    public double pracownicyPensjaSumaPerStanowisko(Stanowisko stanowisko) {
        double pensje = 0;
        Iterator<Pracownik> iteratorP = this.iterator(stanowisko);
        while(iteratorP.hasNext()) {
            pensje += iteratorP.next().getPensja();
        }
        return pensje;
    }

    public double pracownicyPensjaSrednia() {
        double pensje = 0;
        for(Pracownik pracownik : this) {
            pensje += pracownik.getPensja();
        }
        return pensje / this.getPracownicySize();
    }

    public double pracownicyPensjaSredniaPerStanowisko(Stanowisko stanowisko) {
        double pensje = 0;
        Iterator<Pracownik> iteratorP = this.iterator(stanowisko);
        while(iteratorP.hasNext()) {
            pensje += iteratorP.next().getPensja();
        }
        return pensje / this.getPracownicySizePerStanowisko(stanowisko);
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

    @Override
    public Iterator<Pracownik> iterator() {
        return new FirmaIterator();
    }

    public Iterator<Pracownik> iterator(Stanowisko stanowisko) {
        return pracownicy.stream().filter(pracownik -> pracownik.getStanowisko() == stanowisko).iterator();
    }

    public class FirmaIterator implements Iterator<Pracownik>{
        private int pracownikCounter = 0;

        @Override
        public boolean hasNext() {
            if(pracownikCounter < pracownicy.size()){
                return true;
            }
            return false;
        }

        @Override
        public Pracownik next() {
            return pracownicy.get(pracownikCounter++);
        }
    }
}
