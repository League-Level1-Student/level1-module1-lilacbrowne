
public class SmurfRunner {

	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		System.out.println(Handy.getName());
		Handy.eat();
		Smurf Papa = new Smurf("Papa");
		System.out.println(Papa.getName());
		System.out.println(Papa.getHatColor());
		System.out.println(Papa.isGirlOrBoy());
		Smurf Smurfette = new Smurf("Smurfette");
		Smurfette.eat();
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
		
	}
}