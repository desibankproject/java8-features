package java8;

public class LamdaExpressionDemo2 {
		public static void main(String[] args) {
			Runnable runnable=()-> {
				for(int x=1;x<200;x++){
					System.out.println("_@_@)@)@)@)Ahaha-020202020  = "+x);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			new Thread(runnable).start();
		}
}
