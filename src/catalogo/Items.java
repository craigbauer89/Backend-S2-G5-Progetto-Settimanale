package catalogo;

public abstract class Items implements Item{
	
	
	private int codiceISBN;
	private String titolo;
	private int annoPubblicato;
	private int numeroPagine;
	
	public Items(int codiceISBN, String titolo, int annoPubblicato, int numeroPagine) {
		super();
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicato = annoPubblicato;
		this.numeroPagine = numeroPagine;
	}

	public int getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(int codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicato() {
		return annoPubblicato;
	}

	public void setAnnoPubblicato(int annoPubblicato) {
		this.annoPubblicato = annoPubblicato;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	
	public String toString() {
		return 
		String.format("Items{codiceISBN: %s, titolo: %s, annoPubblicato: %s, numeroPagine: %s", codiceISBN, titolo, annoPubblicato, numeroPagine);
		
			
		}

	
	}
	
	


