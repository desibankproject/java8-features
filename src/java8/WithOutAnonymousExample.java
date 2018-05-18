package java8;


/**
 * 
 * @author 
 * This example is without anonymous class
 *
 */
public class WithOutAnonymousExample {
	
	  public static void main(String[] args) {
		  Thread t=Thread.currentThread();
		  System.out.println("Main thread is executing ..."+t);
		 Task task=new Task();
		  new Thread(task).start();;
	}

}
