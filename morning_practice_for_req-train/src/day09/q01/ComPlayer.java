package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable{
	private String name = "コンピューター";
	
	public int doJanken()throws IOException{
		int num = (int)Math.random()*3;
		String rsp[] = {"グー","チョキ","パー"};
		System.out.println(name+"は"+rsp[num]+"を出した");
		return num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
