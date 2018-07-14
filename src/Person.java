
public class Person {
private String name;
private String superpower;

public String getName() {
	return name;
}
public String getSuperpower() {
	return superpower;
}
void setName (String name) {
	this.name = name;
}
void setSuperpower (String superpower) {
	this.superpower = superpower;
}
public String toString() {
	return name + " has mad " + superpower + " skills!";
}}
