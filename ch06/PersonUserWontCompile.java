// PersonUserWontCompile.java
// WON'T COMPILE

package object;

public class PersonUserWontCompile {
    public static void main(String[] args) {
	Person buck = Person.apply("Buck Trends", 100);  // ERROR
	System.out.println(buck);
    }
}
