package utills;

public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l = new String();
		
		for(int i=1; i<=20; i++) {
			for(int j=1; j<=20; j++) {
				int k = i*j;
				
				if(k<10) {
					l = Integer.toString(k);
					l="  "+k;
				}else if(k<100) {
					l = Integer.toString(k);
					l=" "+k;
				}else {
					l = Integer.toString(k);
				}
				System.out.print(l+" |");
			}
			System.out.println("");
		}
	}

}
