package menjacnicaa;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Kurs {
	private double prodajniKurs, kupovniKurs, srednjiKurs;
	private GregorianCalendar datumKursa;

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	private String naziv, skraceniNaziv;
	private String sifra;
	
	public String getSifra(){
		return sifra;
	}
	
	public void setSifra(String sifra){
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv==null)
			throw new RuntimeException("Naziv ne sme biti null.");
		
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv==null)
			throw new RuntimeException("skraceniNaziv ne sme biti null.");

		this.skraceniNaziv = skraceniNaziv;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs)throws Exception {
		if(prodajniKurs<0)
			throw new Exception("Kurs ne sme biti manji od nule.");
		this.prodajniKurs = prodajniKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs)throws Exception {
		if(kupovniKurs<0)
			throw new Exception("Kurs ne sme biti manji od nule.");
		
		this.kupovniKurs = kupovniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs)throws Exception {
		if(srednjiKurs<0)
			throw new Exception("Kurs ne sme biti manji od nule.");
		this.srednjiKurs = srednjiKurs;
	}

	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}

	public void setDatumKursa(GregorianCalendar datumKursa) throws Exception{
		GregorianCalendar danasnjiDan = new GregorianCalendar(GregorianCalendar.YEAR, GregorianCalendar.MONTH, GregorianCalendar.DAY_OF_MONTH);;
		
		if(datumKursa.before(danasnjiDan))
			throw new Exception("Datum ne sme biti u proslosti.");
		this.datumKursa = datumKursa;
	}

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute)throws Exception {
		if(valute.isEmpty())
			throw new Exception("Lista ne sme biti prazna.");
		this.valute = valute;
	}

	@Override
	public String toString() {
		return "Kurs [prodajniKurs=" + prodajniKurs + ", kupovniKurs="
				+ kupovniKurs + ", srednjiKurs=" + srednjiKurs
				+ ", datumKursa=" + datumKursa + ", valute=" + valute + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((datumKursa == null) ? 0 : datumKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datumKursa == null) {
			if (other.datumKursa != null)
				return false;
		} else if (!datumKursa.equals(other.datumKursa))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

}
