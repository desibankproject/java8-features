
@FunctionalInterface
interface OK{
	public int cal(int num);
}

public class Square {
		public static void main(String[] args) {
			OK ok=new OK() {
				@Override
				public int cal(int num) {
					return num*num;
				}
			};
			
			OK ok2=num -> num*num;
		}
}	
