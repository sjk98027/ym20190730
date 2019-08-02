package nestedClass;

public class LocalClassExample2 {
	interface HelloThere{
		void greet();
	}
	
	public static void greetInEnglish(String name) {
		class EnglishHelloThere implements HelloThere{
			String name; 
			public EnglishHelloThere(String name) {
				this.name = name;
			}
			
			@Override
			public void greet() {
				System.out.println("Hello" + this.name);
			}
			
		}
		HelloThere myGreeting = new EnglishHelloThere(name);
		myGreeting.greet();
	}
		
	public static void main(String[] args) {
		greetInEnglish("Scott");
	}
	
	
}
