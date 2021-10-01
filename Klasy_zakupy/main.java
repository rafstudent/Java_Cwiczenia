public class main
{
    public static void main(String[] args)
    {
        Zakup zakup = new Rzecz();
        zakup.setPosiadana_kwota(100);
        zakup.setCena(50);
        zakup.zlicz();
        zakup.zlicz_kwote();

        Zakup zakup2 = new Rzecz();
        zakup2.setPosiadana_kwota(zakup.getPosiadana_kwota() - zakup.getCena());
        zakup2.setCena(30);
        zakup2.zlicz();

        int Zakup_suma = zakup.getCena() + zakup2.getCena();
        int Pozostala_kwota_po_zakupach = zakup2.getPosiadana_kwota() - zakup2.getCena();

        System.out.println("Posiadana kwota na zakupy = " + zakup.getPosiadana_kwota());
        System.out.println("Cena pierwszego zakupu = " + zakup.getCena());
        System.out.println("Pozostała kwota po pierwszym zakupie = " + zakup2.getPosiadana_kwota());
        System.out.println("Cena drugiego zakupu = " + zakup2.getCena());
        System.out.println("Pozostała kwota po pierwszym i drugim zakupie = " + Pozostala_kwota_po_zakupach);
        System.out.println("Cena wszystkich zakupów = " + Zakup_suma);
    }
}