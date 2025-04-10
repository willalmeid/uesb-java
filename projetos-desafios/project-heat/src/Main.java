import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int size = 10;
		int[][] metalBar = new int[size][size];
		int[][] metalBarIteration = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				metalBar[i][j] = random.nextInt(20) + 1;
				metalBarIteration[i][j] = metalBar[i][j];
			}
		}
		
		System.out.println("----------------------------------");
		System.out.println("Metal Bar Inicial");
		printMetalBar(metalBar, size);
		System.out.println("----------------------------------");
		
		while(verificarFim(metalBar, size)) {
			
			calcularValores(metalBar, metalBarIteration, size);
			
			atualizarCalor(metalBar, metalBarIteration, size);
			
			System.out.println("\n ----------------------------- \n");
			
			printMetalBar(metalBar, size);	
			
		}
		
	}
	
	public static void printMetalBar(int[][] metalBar, int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(metalBar[i][j] < 10 ? "[00" + metalBar[i][j] + "] " : metalBar[i][j] < 99 ? "[0" + metalBar[i][j] + "] " : "[" + metalBar[i][j] + "] ");
			}
			System.out.println("\n");
		}
	}
	
	public static void calcularValores(int[][] metalBar, int[][] metalBarIteration, int size) {
		
		int top, right, bottom, left; 
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {		
				if(j == 0) {
					left = 1000;
				} else  {
					left = metalBar[i][j-1];
				}
				
				if(j == size -1) {
					right = 1000;
				} else {
					right = metalBar[i][j + 1];
				}
				
				if(i == 0) {
					top = 1000;
				} else {
					top = metalBar[i - 1][j];
				}
				
				if(i == size - 1){
					bottom = 1000;
				} else {
					bottom = metalBar[i + 1][j];
				}
				
				metalBarIteration[i][j] = (top + right + bottom + left + metalBarIteration[i][j]) / 5;
			}
		}
	}
	
	public static void atualizarCalor(int[][] metalBar, int[][] metalBarIteration, int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				metalBar[i][j] = metalBarIteration[i][j];
			}
		}
	}
	
	public static boolean verificarFim(int[][] metalBar, int size) {
		if(metalBar[size/2][size/2] > 500) {
			return false;
		}
		
		return true;
	}
}
