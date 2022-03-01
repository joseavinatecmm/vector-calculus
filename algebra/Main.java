public class Main {

   public static void main(String noseusa[]){
     Vector v = new Vector(2,2,2);
     Vector v2 = new Vector(2,2,2);
     VectorOperations operations = 
	     new VectorOperations(v);

     System.out.println(operations.calculateMagnitude());
     System.out.println(operations.addVectors(v,v2));
   } 
}
