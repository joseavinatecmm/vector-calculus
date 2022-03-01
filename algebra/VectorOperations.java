import java.lang.Math;

public class VectorOperations {
	Vector v;

	public VectorOperations(Vector theVector) {
		v = theVector;
	}

	public double calculateMagnitude() {
return Math.sqrt(Math.pow(v.getXValue(), 2) + Math.pow(v.getYValue(), 2) + Math.pow(v.getZValue(), 2)); 		
	}
	public String addVectors(Vector v1, Vector v2 ) {
         double totalX = v1.getXValue()+
		 v2.getXValue();	
         double totalY = v1.getYValue()+
		 v2.getYValue();	
         double totalZ = v1.getZValue()+
		 v2.getZValue();
 	String vectorResultante;
vectorResultante=totalX+"i + "+totalY+"j + "+
	totalZ+"k";
       	return vectorResultante;
	}

}
