package day08.q01;

public class Sorcerer extends Magic{

	public Sorcerer(String name) {
		super(name);
	}

	@Override
	public void attack(int mp) {
		// TODO 自動生成されたメソッド・スタブ
		super.attack(mp);
		int pdm = (int)(0.5*mp);
		System.out.println("追加で"+pdm+"のダメージを与えた");
	}
	
	
	

}
