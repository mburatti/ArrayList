import java.util.ArrayList;

public class MeuArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Michael");
		list.add("Sibele");
		list.add("Girafinha");
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.remove("Sibele");
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
	}

}
