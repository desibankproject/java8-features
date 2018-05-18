
//an interface which contains only one method declaration is called Functional Interface
@FunctionalInterface
interface Pack {
	public void show(String message);
}

public class Demo {
		public static void main(String[] args) {
			Pack  p=new  Pack() {
						public void show(String message)  {
								System.out.println("_#_#)#message )(#(#"+message);
						}
			};
			p.show("Ahahah");
			//In Lamda format
			Pack  lm= message ->System.out.println("_#_#)#message )(#(#"+message);
			lm.show("23432");
		}
}
