package interfaces;

public interface RemoteControl {
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME= 0;
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute)
		System.out.println("무음처리합니다");
		else
			System.out.println("무음해제합니다");
	};//구현해도 되고 안해도되게 처리하는 기법.
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
