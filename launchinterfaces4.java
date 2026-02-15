
interface Telusko{
    void show();
    
    default void disp() {         //default in class means modifier which is not public and protected but in interfaces it means a method which have body, it came after Java8.
    	System.out.println("Telusko is coming up with fast tract boot resources");
    }
    
    static void announcement() {   //Static methods of an interface do not get inherited.
    	System.out.println("8 days fast spring boot course is announced by telusko");
    }
}


class Alien implements Telusko{
	      @Override
	    public void show() {
	    // TODO Auto-generated method stub
	    System.out.println("Hello Aliens Welcome back");
	    }
	     public void disp() {        //default methods in an interface can be overridden.
			System.out.println("Telusko ki mkbfj");
		}

}

public class launchinterfaces4 {
	   public static void main(String[] args) {
		
	
	    Alien  a = new Alien ();
	    a.show();
	    a.disp();
	    
	   }
}
