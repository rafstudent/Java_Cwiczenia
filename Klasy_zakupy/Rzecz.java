public class Rzecz extends AbstractZakup {
    public void zlicz_kwote() {
        super.setPosiadana_kwota(super.getPosiadana_kwota());
    }
    public void zlicz() {
        super.setCena(super.getCena());
    }
}
