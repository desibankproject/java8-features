package java8;

public class MainFacto {
		public static void main(String[] args) {
			Facto f=(num) -> {
					int sum=1;
					for(int x=2;x<=num;x++){
						sum=sum*x;
					}
					return sum;
			};
			System.out.println(f.fact(5));
		}
}
