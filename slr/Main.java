
public class Main {

	public static void main(String[] noseusa) {
		double sales[]= {0,0,0,0,0,0,0,0,0};
		double advertising[]= {0,0,0,0,0,0,0,0,0};

		SLR slr = new SLR();
		double beta0 = 0, beta1 = 0;
		//DataSet ds = new DataSet();


		beta0 = slr.calculateB0(sales, advertising);
		beta1 = slr.calculateB1(sales, advertising);

		slr.displayRegEq();
		slr.predict(70);

	}
}
