package java8;


//Same example I am doing with anonymous class
public class WithAnonymousClass {
	
	public static void main(String[] args) {
		  Runnable runnable=new Runnable() {
			@Override
			public void run() {
				for(int x=1;x<=500;x++){
					System.out.println("x= "+x);
				}
			}
		};
		new Thread(runnable).start();
	}
}
