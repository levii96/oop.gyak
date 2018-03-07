
public class AlkalmazottHasznalo {

	public static void main(String[] args) {
		Alkalmazott alkalmazottobj = new Alkalmazott();
		
		// a private modosito meg nem volt
		//alkalmazottobj.nev ="Kiss Istvan";
		//alkalmazottobj.fizetes = 10;
		
		alkalmazottobj.setNev("Kiss Istvan");
		alkalmazottobj.setFizetes(10);
		
		System.out.println(alkalmazottobj.toString());	
		System.out.println(alkalmazottobj);
		
		alkalmazottobj.fizetesNovelese(5);
		
		System.out.println(alkalmazottobj);
		 
		System.out.println("alkalmazott neve : " + alkalmazottobj.getNev());
				
		System.out.println(alkalmazottobj.getFizetes());
		
		System.out.println(alkalmazottobj.FizetesIntervallumokKozott(10, 50));
		System.out.println(alkalmazottobj.FizetesIntervallumokKozott(10, 14));
		
		System.out.println(alkalmazottobj.fizetendoAdo());
	
		Alkalmazott alkalmazott2 = new Alkalmazott();
	
		alkalmazott2.setNev("kiss klaudia");
		alkalmazott2.setFizetes(35);
		alkalmazott2.fizetesNovelese(11);
		
		System.out.println(alkalmazott2);
		
		System.out.println(alkalmazottobj.fizetesNagyobbMint(alkalmazott2));
		System.out.println(alkalmazott2.fizetesNagyobbMint(alkalmazottobj));
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("XY");
			alkalmazottak[i].setFizetes((long) (Math.random()*50));
			System.out.println(alkalmazottak[i]);
			
		}

		int legnagyobbindex = 0;
		for (int i = 0; i < alkalmazottak.length; i++) {
			if ( alkalmazottak[i].getFizetes() > alkalmazottak[legnagyobbindex].getFizetes())
					legnagyobbindex =  i;
		}
		
				
		System.out.println("max fizetesu alkalmazott");
				System.out.println(alkalmazottak[legnagyobbindex]);
			
			}
	}

