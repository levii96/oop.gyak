
public class Alkalmazott {
	
	private String nev; 
	private	long fizetes;
	
	public void fizetesNovelese(long novekmeny) {
		fizetes += novekmeny;
		
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", fizetes=" + fizetes + "Ft";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}
	
	public boolean FizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		
		return fizetes>= alsohatar
				&& fizetes <= felsohatar;
	
	}
	
	public long fizetendoAdo () {
		return (long)(fizetes * 0.16*12);

	}
	
	
	public boolean fizetesNagyobbMint(Alkalmazott masik){
		return	fizetes > masik.fizetes;
		
	}
	
}
