class A{
	
	public void show() {
		System.out.println("in A show");
	}	
}

class B{
	
	public void show() {
		System.out.println("in B show");
	}
}

public class launchlambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A obj = new A(){         //Anonymous inner class
           public void show() {
			System.out.println("in new show");
		} 
         };
         obj.show();
    
	
	          new B().show();
	          
	          new A() {
	        	   public void show() {
	       			System.out.println("in new show");
	        	 
	      }
	        	public void getdata() {
	        		System.out.println("get the data");
	        	}
					
				}.getdata();
  }
	
}
