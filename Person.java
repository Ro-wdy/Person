public class Person {
	String name;
    int age;
    
	  public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Setting properties
        Person person1 = new Person("Rhodah",28);
        
        Person person2 = new Person("Mulera",25);
        

      
     // Printing person details
        System.out.println("Person 1 Details: " + 
            person1.name + " " + person1.age);
        System.out.println("Person 2 Details: " + 
            person2.name + " " + person2.age);

}
}