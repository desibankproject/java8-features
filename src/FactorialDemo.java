

@FunctionalInterface
interface Paula {
	public int fact(int num);
}


public class FactorialDemo {
		public static void main(String[] args) {
			
			Paula paula=new Paula() {
				@Override
				public int fact(int num) {
					 int sum=1;
					 for(int x=2;x<=num;x++){
						  sum=sum*x;
					 }
					return sum;
				}
			};
			System.out.println(paula.fact(4));
			
			Paula paula2=num -> {
					 int sum=1;
					 for(int x=2;x<=num;x++){
						  sum=sum*x;
					 }
					return sum;
				};
				//Stream + Lamda  - functional programming
				int ppp=100+paula2.fact(5);
		}
}
