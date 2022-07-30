package catalogo;

public class Rivista extends Items {
	
	private Period period;

	public Rivista(int codiceISBN, String titolo, int annoPubblicato, int numeroPagine, Period period) {
		super(codiceISBN, titolo, annoPubblicato, numeroPagine);
		this.period = period;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return 
		String.format("Items{codiceISBN: %s, titolo: %s, annoPubblicato: %s, numeroPagine: %s, period: %s", getCodiceISBN(), getTitolo(), getAnnoPubblicato(), getNumeroPagine(), period);
		
			
		}

	
	
	
	

	
	
}
