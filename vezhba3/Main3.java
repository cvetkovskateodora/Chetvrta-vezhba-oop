package vezhba3;

public class Main3 {

	public static void main(String[] args) {
        Proizvod p = new Proizvod ();
        System.out.println("Ime na proizvod: " + p.getIme());
        System.out.println("Proizvoditel: " + p.getProizvoditel());
        System.out.println("Cena: " + (int)p.getCena() + " denari.");
        System.out.println("Tezhina: " + p.getTezhina() + " grama.");
    }
	
}
