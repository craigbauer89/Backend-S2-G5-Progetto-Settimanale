package catalogo;



public class Libro extends Items {
	
	
	
	private String autore;
	private String genere;
	
	
	public Libro(int codiceISBN, String titolo, int annoPubblicato, int numeroPagine, String autore, String genere) {
		super(codiceISBN, titolo, annoPubblicato, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Libro; //&& this.hashCode() == obj.hashCode();
	}


	@Override
	public String toString() {
		return 
		String.format("Items{codiceISBN: %s, titolo: %s, annoPubblicato: %s, numeroPagine: %s, autore: %s, genere: %s", getCodiceISBN(), getTitolo(), getAnnoPubblicato(), getNumeroPagine(), autore, genere);
		
			
		}
	
	




	
	
	
	


}
