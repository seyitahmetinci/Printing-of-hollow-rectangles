package dikdortgen;

public class dikdortgen1 {
	public static void main(String[] args) {
		
		int x=5;
		int y=9;
		int tempX;
		int tempY;
		
		for(tempY = 1; tempY <= y; tempY++) {
			
			for(tempX = 1; tempX <= x; tempX++){				
				if(tempY == 1) {
					System.out.print("*");
				}
				else if(tempY == y) {
					System.out.print("*");
			
				}
				else {
				
				   if(tempX == 1) {
					System.out.print("*");
				   }
				   else if(tempX == x) {
					System.out.print("*");
				   }
				   else {
					System.out.print(" ");
				   }
				}
			}
			
			System.out.println(" ");
		}
	}
}
				
				
				
		

		
	


