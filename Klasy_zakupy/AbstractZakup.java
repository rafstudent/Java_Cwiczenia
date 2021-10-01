public abstract class AbstractZakup implements Zakup {

    private int Posiadana_kwota;
    private int Cena;

    public int getPosiadana_kwota() {
        return Posiadana_kwota;
    }

    public void setPosiadana_kwota(int Posiadana_kwota) {
        this.Posiadana_kwota = Posiadana_kwota;
    }

    public int getCena() {
        return Cena;
    }

    public void setCena(int Cena) {
        this.Cena = Cena;
    }
}
