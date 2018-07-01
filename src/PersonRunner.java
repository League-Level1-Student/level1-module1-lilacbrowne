
public class PersonRunner {
	
	
	public static void main(String[] args) {
		Person Cat = new Person();
		Cat.setName("Cat");
		Cat.setSuperpower("flying");
		System.out.println(Cat.getName());
		System.out.println(Cat.getSuperpower());
	System.out.println(Cat.toString());
	}
	private String name;
	private String superpower;
	public String toString() {
		return name + " has mad" + superpower + " skills!";
		
	}
}
