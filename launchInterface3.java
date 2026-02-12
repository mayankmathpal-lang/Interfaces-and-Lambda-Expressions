interface Demo4{
	void disp();
}

//interface Demo2 extends Demo1{
//	void show();
//}

interface Demo3{
	void disp();
	float pi=3.14f;     //Variable inside an interface are by default public, static and final.
             
}
class Alpha1 implements Demo4,Demo3{    //Multiple interfaces can implement a class.
	
	public void disp() {
		System.out.println("Focus is the key");
	}
	
//	public void show() {
//		System.out.println("Focus is the key");
//	}
}


public class launchInterface3 {
	
	public static void main(String[] args) {
		
     Demo4 d = new Alpha1();
     d.disp();
     
     Demo3 d2 = new Alpha1();
     d2.disp();
     
//      Demo3.pi=4.14;    type mismatch a variable inside a interface cannot be overridden.
     
	
}
}
