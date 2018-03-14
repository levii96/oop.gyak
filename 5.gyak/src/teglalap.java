
public class teglalap {
		
		private int a_oldal;
		private int b_oldal;
		
		public teglalap(int a_oldal, int b_oldal) {
			
			//super();
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
			
			//this(oldalhossz,oldalhossz);
			
		}

		public teglalap(int oldalhossz) {
			this.a_oldal = oldalhossz;
			this.b_oldal = oldalhossz;
			//this.a_oldal = this.b_oldal = oldalhossz;	
		}
		
		public int terulet() {
			return a_oldal * b_oldal;
			
		}

		@Override
		public String toString() {
			return "teglalap [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal	+ ", terulet()=" + terulet() + "]";
		}

		public void setOldalak(int a_oldal,int b_oldal) {
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
		}

		public void setOldalak(int oldalhossz){
			setOldalak(oldalhossz,oldalhossz);
		}
		
		public boolean nagyobbTeruletuMint(teglalap masikteglalap){
			return terulet() > masikteglalap.terulet();
		}
		
		public boolean egyenloek(teglalap masikteglalap){
		return	a_oldal == masikteglalap.a_oldal 
				&& b_oldal == masikteglalap.b_oldal;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
