package kr.co.softsoldesk.beans;

public class SonySpeaker {

	public SonySpeaker() {
		System.out.println("=========> SonySpeaker 객체생성");
	}
	public void volumeUp(){
        System.out.println("SonySpeaker---소리 올린다.");
    }        
    public void volumeDown(){
        System.out.println("SonySpeaker---소리 내린다.");
    }
}