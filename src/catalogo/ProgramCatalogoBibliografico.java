package catalogo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class ProgramCatalogoBibliografico {
	
	private static void writeFile(String item) throws IOException{
		File file = new File("src/catalogo/dati.txt");
		FileUtils.writeStringToFile(file,item, "UTF-8",false);
	}
	
	private static void readFile() throws IOException{
		File file = new File("src/catalogo/dati.txt");
		String readString = FileUtils.readFileToString(file, "UTF-8");
		System.out.println("Dati scaricato dal text file" );
		System.out.println(readString);
	}
	
	public static void main(String[] args) {
//		
//			List<Items> elementi2 = Arrays.asList(
//			new Libro(123, "Arturo La Grande", 2022, 789, "Marco Rossi", "Crimi"),
//			new Libro(124, "A Wonderful life", 2022, 560, "Marco Rossi", "Love"),
//			new Libro(125, "La Bella Vita", 2008, 200, "Jane Verdi", "Drama"),
//			new Rivista(546, "Mens Health",  2022, 15, Period.MENSILE),
//			new Rivista(547, "Hello",  2022, 22, Period.MENSILE),
//			new Rivista(548, "Vogue",  2021, 29, Period.MENSILE),
//			new Rivista(549, "A Magazine",  2021, 29, Period.MENSILE));
//		
//		Stream<Object> aggiungeItem = elementi2.stream() 
//		.map(x -> "Numero: " +  x); 
//		elementi2.add(new Libro(122, "Amazing Places", 1996, 430, "Tim Lovejoy", "Action"));
//		
//
//		aggiungeItem.forEach(System.out::println);
		
		
		
		List<Items> elementi = new ArrayList<>();
		
			//aggiunte di un elemento
			elementi.add(new Libro(122, "Amazing Places", 1996, 430, "Tim Lovejoy", "Action"));
			elementi.add(new Libro(123, "Arturo La Grande", 2005, 859, "Marco Mauri", "Drama"));
			elementi.add(new Libro(123, "La Grande Bellezza", 2022, 789, "Marco Rossi", "Crimi"));
			elementi.add(new Libro(124, "Dancing in the Sun", 2022, 510, "Marco Bruno", "Love"));
			elementi.add(new Libro(124, "A Wonderful life", 2007, 560, "Marco Bruno", "Love"));
			elementi.add(new Libro(124, "Chi sapremmo", 2022, 560, "Marco Bruno", "Crimi"));
			elementi.add(new Libro(125, "La Bella Vita", 2008, 200, "Jane Verdi", "Drama"));
			elementi.add(new Rivista(546, "Mens Health",  2022, 15, Period.MENSILE));
			elementi.add(new Rivista(547, "Hello",  2022, 22, Period.MENSILE));
			elementi.add(new Rivista(548, "Vogue",  2021, 29, Period.MENSILE));
			elementi.add(new Rivista(549, "A Magazine",  2021, 29, Period.MENSILE));
			
			System.out.println("Stampa gli elementi");
			elementi.stream()
			.forEach(System.out::println);
			
			// Rimozione dato un codice
			System.out.println("Stampa gli elementi dopo averne rimosso uno");
			elementi.stream()
			.filter(p -> p.getCodiceISBN() != 548) 
			.forEach(System.out::println);
			
			// Ricerca per autore
			System.out.println("Ricerca per autore con nome Marco");
			elementi.stream()
			.filter(p -> p instanceof Libro) 
			.filter(p -> ((Libro) p).getAutore().startsWith("Marco"))
			.map(item -> item.getTitolo() + " -> Numero di Pagine: " + item.getNumeroPagine())
			.forEach(System.out::println);
			System.out.println("Ricerca per autore con nome Marco Bruno");
			elementi.stream()
			.filter(p -> p instanceof Libro) 
			.filter(p -> ((Libro) p).getAutore().equals("Marco Bruno"))
			.forEach(System.out::println);
			
			// Ricerca per anno pubblicazione
			System.out.println("Ricerca per anno pubblicazione di 2022");
			elementi.stream()
			.filter(p -> p.getAnnoPubblicato()== 2022) 
			.forEach(System.out::println);
			System.out.println("Ricerca per codice 547");
			elementi.stream()
			.filter(p -> p.getCodiceISBN() == 547) 
			.forEach(System.out::println);
			System.out.println("Ricerca per codice 547 e salvarlo in disco dell'archivio, e dopo caricato dal disco dell'archivio");
			elementi.stream()
			.filter(p -> p.getCodiceISBN() == 547) 
			.forEach( e-> {
				try {
					writeFile(e.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});


			//Caricamento dal disco dell'archivio
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
