
// Author José Antonio Aviña Méndez
// TecMM

public class Main {

	public static void main(String[] noseusa) {
		// hard-codear vectores
		double sales[]= {0,0,0,0,0,0,0,0,0};
		double advertising[]= {0,0,0,0,0,0,0,0,0};

		// instanciar un objeto tipo Simple Linear Regression (SLR)
		SLR slr = new SLR();
		double beta0 = 0, beta1 = 0;
		//DataSet ds = new DataSet();


		// calcular parámetros del model b0 y b1
		beta0 = slr.calculateB0(sales, advertising);
		beta1 = slr.calculateB1(sales, advertising);

		// desplegar ecuación de regresión
		slr.displayRegEq();

		// predicir las ventas en función de 70 millones invertidos en advertising
		slr.predict(70);

	}
}
