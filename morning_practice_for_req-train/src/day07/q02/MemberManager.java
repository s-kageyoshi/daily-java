package day07.q02;

public class MemberManager {

	private MemberManager() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public static void show(Member[] list) {
		System.out.println("メンバー一覧を表示します");
		for (Member member : list) {
			member.show();
		}
	}
	public static void update(Member[] list, int id, String name) {
		System.out.println("ID:"+ id+ "のメンバー名を"+ name + "に変更します");
		for (Member member : list) {
			if(member.getId() == id) {
				member.setName(name);
				break;
			}
		}
	}

}
