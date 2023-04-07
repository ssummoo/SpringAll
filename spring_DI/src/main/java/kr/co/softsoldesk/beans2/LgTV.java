package kr.co.softsoldesk.beans2;



public class LgTV implements TV{

	private int price;
	private AppleSpeaker speaker;
	
	
	public int getPrice() {
		System.out.println("가격 : "+price);
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public LgTV() {
		System.out.println("======> LGTV(1) 객체 생성 ");
	}
	public LgTV(AppleSpeaker speaker) {/**/
		System.out.println("======> LGTv(2) 객체 생성 ");
		this.speaker=speaker;
	}
	public LgTV(int price , AppleSpeaker speaker) {
		System.out.println("======> LGTv(3) 객체 생성 ");
		this.price=price;
		this.speaker=speaker;
		
	}
	@Override
	public void powerOn() {
		System.out.println("LGTV -------- POWER ON");
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV -------- POWER OFF");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	public AppleSpeaker getSpeaker() {
		System.out.println("speaker : "+speaker);
		return speaker;
	}
	public AppleSpeaker setSpeaker() {
		return speaker;
		
	}

	
	
}
