
public class CatRunner {
public static void main(String[] args) {
	Cat kitty = new Cat("kitty");
	kitty.meow();
	kitty.printName();
	for(int i = 9; i > 0; i--) {
	kitty.kill();
	}
}
}
