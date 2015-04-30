package menjacnicaInterfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaa.Kurs;
import menjacnicaa.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(Kurs kurs);
	public void obrisiKurs(Kurs kurs);
	public LinkedList<Kurs> pronadjiKurs(GregorianCalendar datumKursa, double prodajniKurs, double kupovniKurs, double srednjiKurs, Valuta valuta);
	
	public void ucitajIzFajla(String putanja);
	public void sacuvajUFajl(String putanja);
}
