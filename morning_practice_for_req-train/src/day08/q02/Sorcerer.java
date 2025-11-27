package day08.q02;

public class Sorcerer extends Magic{

	public Sorcerer(String name) {
		super(name);
	}

	@Override
	public void attack(int mp,Monster monster) {
		// TODO 自動生成されたメソッド・スタブ
		super.attack(mp,monster);
		int pdm = (int)(0.5*mp);
		System.out.println("追加で"+pdm+"のダメージを与えた");
		monster.setHp(monster.getHp()-pdm);
	}
	
	
	

}
