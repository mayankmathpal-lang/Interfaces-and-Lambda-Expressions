//abstract class P{
//	
//	abstract void show();
//	
//}

//class R extends P{
//	
//	public void show() {
//		System.out.println("in show");
//	}
//	
//}
@FunctionalInterface  //SAM(single abstract method) after java8 IT was functional interface
interface P{
	void show();
//	void chomu();      Started showing error because functional interface can have only one abstract method
	default void disp() {
		System.out.println("it was out");     // no error because in functional interface we can have multiple methods but abstract method should always be one.
	}
	
	
}
public class launchlambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               P obj = new P() {         //we cannot create object of abstract class and interface however we can create an anonymous inner class for them.
          
            	   public void show() {
					System.out.println("AAg maa ka bhosda aag");
					
				}
                
               };
               obj.show();  
                 
               
//		  P obj = ()-> System.out.println("aag maa ka bhosdaa aag");
//		  obj.show();
		
	}
}
