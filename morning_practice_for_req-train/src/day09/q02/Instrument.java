package day09.q02;

public abstract class Instrument {
	protected String maker;

	public Instrument(String maker) {
		super();
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	public abstract void playMusic();

}
