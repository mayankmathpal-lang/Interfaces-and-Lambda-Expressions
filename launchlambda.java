
class Person{
	public void printname() {
	
		System.out.println("Suresh");
	}
	
  static class Phone {
		
		public void details() {
			System.out.println("OnePlus");
		
		}
	}

}

public class launchlambda {

	public static void main(String[] args) {
	
               Person obj = new Person();
               obj.printname();
               
               Person.Phone obj1 = new Person.Phone();
               
               obj1.details();
		
               
		
	}
}


