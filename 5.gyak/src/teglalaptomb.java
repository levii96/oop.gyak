
public class teglalaptomb {

	
	public static void main(String[] args) {
		int meret = 10;
		
		teglalap[] teglalapok = new teglalap[meret];
		
		for (int i = 0; i < teglalapok.length; i++) {
			teglalapok[i] = new teglalap((int)(Math.random() * 9)+2);
		
		
			System.out.println(teglalapok[i]);
		}
	
		
	
	
		int legkisebb = 0 ;
		
		 for (int j = 1; j < teglalapok.length; j++) {
			if(teglalapok[legkisebb].nagyobbTeruletuMint(teglalapok[j])){
				legkisebb = j;
			}
		 }
		
		 System.out.println(teglalapok[legkisebb]);
		}

	}


