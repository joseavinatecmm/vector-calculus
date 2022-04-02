
// Author José Antonio Aviña Méndez
// TecMM


public class SLR {
	private double beta0;
	private double beta1;

	
	SLR() {
           beta0 = 0;
	   beta1 = 0;
	}
        

	// Calcular B0,  parámtero del modelo SLR 
	public double calculateB0(double[] vectorSales, double[]  vectorAdvertising) {
			
		beta0 = 0;// aquí se codifica el modelo matemático construido en clase para B0

		return beta0;
	}

	// Calcular B1,  parámtero del modelo SLR 
	public double calculateB1(double[] vectorSales, double[] vectorAdvertising) {
		
		beta1 = 0;// aquí se codifica el modelo matemático construido en clase para B1

		return beta1;
	}

	// Imprimir ecuación de regresión
	public void displayRegEq() {
	
		System.out.println("sales =  " + beta0 + " + " + beta1 + " + " + "advertising");
	}

	public void predict(double advertising) {
		double sales = 0;

		sales = beta0 + (beta1 * advertising);

		System.out.println("Dado el valor de advertsing: " + advertising + " las ventas predicidas son = " + sales);
	}
}
