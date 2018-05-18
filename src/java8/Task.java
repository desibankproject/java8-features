package java8;

/**
 * 
 * @author nagendra
 *
 */
class Task implements Runnable {
	@Override
	public void run() {
		for(int x=1;x<=500;x++){
			System.out.println("x= "+x);
		}
	}
}
