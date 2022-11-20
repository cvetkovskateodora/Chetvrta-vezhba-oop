package vezhba1;

public class main1 {

	    public static void main(String[] args) {
	        Chovek c = new Chovek ();
	        c.setIme("Teodora");
	        c.setPrezime("Cvetkovska");
	        c.setEmbg("1810993415222");

	        System.out.println("Ime: " + c.getIme());
	        System.out.println("Prezime: " + c.getPrezime());
	        System.out.println("EMBG: " + c.getEmbg());
	    }
}