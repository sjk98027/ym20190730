package interfaces;

public class SmartTelevision implements Searchable, RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Smart Tv 를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Tv 를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
			
		}
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else
		this.volume=volume;
		System.out.println("현재 Smart Tv 볼륨은 " +this.volume + " 입니다.");
		
	}

	@Override
	public void search(String url) {
		System.out.println(url+" 을 검색합니다");
	}

}
