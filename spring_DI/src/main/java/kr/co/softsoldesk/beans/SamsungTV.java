package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{

	private int price;
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("======> SamsungTV(1) 객체 생성 ");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("======> SamSungTv(2) 객체 생성 ");
		this.speaker=speaker;
	}
	public SamsungTV(int price ,SonySpeaker speaker) {
		System.out.println("======> SamSungTv(3) 객체 생성 ");
		this.price=price;
		this.speaker=speaker;
		
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV -------- POWER ON");
		System.out.println("가격 : "+price);
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV -------- POWER OFF");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	
	
}
