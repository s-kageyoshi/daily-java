package day07.q01;

public class Drink {
	private int price;
	private String name;
	/*
	 * コンストラクタ（引数なし）
	 */
	
	public Drink() {
		super();
		price = 120;
		name = "ビタミン麦茶";
		
	}
	/*
	 * コンストラクタ（引数あり）
	 */

	public Drink(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public void show() {
		System.out.println(name + ":"+price +"円");
	}
	
	
	
	
	

}
