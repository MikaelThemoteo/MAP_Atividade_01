package br.com.map.singleton.ex01;

public class Teste {

	public static void main(String[] args) {
		
		Connection con1 = Connection.getInstance("B");
		Connection con2 = Connection.getInstance("C");
		
		
		System.out.println(con1);
		System.out.println(con2);
	}

}
