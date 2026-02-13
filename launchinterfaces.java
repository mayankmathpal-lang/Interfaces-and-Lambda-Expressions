interface Calc
{
	  void add(int a, int b); //public abstract is automatically written before the void add because its an interface,no need to explicitly add this.
    public abstract void sub(int a, int b);
}

class MyCalc implements Calc{
	 public void add(int a, int b) {
		 int res= a+b;
		 System.out.println("Res is "+res);
	 }
	 public void sub(int a, int b) {
		 int res= a-b;
		 System.out.println("Res is "+res);
	 }
}

class MyCalc1 implements Calc{
	public void add(int a,int b) {
		int n1=a;
		int n2=b;
		int res=n1+n2;
		System.out.println("Res is"+res);
		
	}
	public void sub(int a,int b) {
		int n1=a;
		int n2=b;
		int res=n1-n2;
		System.out.println("Res is"+res);	
	}
}
class MyCalc2 implements Calc{
	
	public void add(int a,int b) {
		if (a>0 &&b>0) {
          int Res= a+b;
          System.out.println("Res is"+ Res);
			
		} else {
           System.out.println("Let the number be non-zero");
		}
		
	}
	
	public void sub(int a,int b) {
		if (a>0 && b>0) {
			int Res=a-b;
			System.out.println("RES is"+ Res);
			
		} else {
			System.out.println("Let the number be non-zero");

		}
		
	}
}

class Algebra{
	public void cal(Calc c,int a, int b) {
		c.add(a, b);
		c.sub(a, b);
	}	
}

public class launchinterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc cal = new MyCalc();
		  MyCalc1 cal1 = new   MyCalc1();
		 MyCalc2 cal2 = new MyCalc2();
		 
		Algebra  a = new Algebra ();
		a.cal(cal, 5, 10);
		a.cal(cal1, 15, 20);
		a.cal(cal2, 20, 10);
//		Calc c= new Calc();    cannot create instance of interface
	}

}
