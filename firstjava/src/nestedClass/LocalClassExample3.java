package nestedClass;

public class LocalClassExample3 {
	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {
		class EnglishGreeting implements HelloWorld{
			String name = "world";
			@Override
			public void greet() {
				greetSomeone("world");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
			
		}
		HelloWorld englishHellogreeting = new EnglishGreeting();
		englishHellogreeting.greet();
		
		HelloWorld frenchGreeting = new HelloWorld() {
			String name ="tout le monde";
			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};
		frenchGreeting.greet();
		
	}

	public static void main(String[] args) {
		LocalClassExample3 myExe = new LocalClassExample3();
		myExe.sayHello();
	}
}
