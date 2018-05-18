package java8;

public class TaskWithLamdaExpression {
	public static void main(String[] args) {
	  Runnable runnable=() -> {
				for(int x=1;x<=500;x++){
					System.out.println("x= "+x);
				}
		};
		new Thread(runnable).start();;
	}	
}
