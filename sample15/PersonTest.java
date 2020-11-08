
class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0] = new Person("‘¾˜Y", 21, "“Œ‹“s`‹æ");
		people[1] = new Person("‰Ôq",18,"–kŠC“¹D–ys");
		people[2] = new Boy("Ÿ˜Y", 9, "•Ÿ‰ªŒ§•Ÿ‰ªs");
		people[3] = new Girl("“q", 8, "‹{éŒ§å‘äs");

		for(int i = 0; i < people.length; i++){
			people[i].say();
		}

		people[2].setName("O˜Y");
    	people[2].setAge(5);
    	people[2].setAddress("‰«“êŒ§“ß”es");
    	people[3].setName("”~q");
    	people[3].setAge(4);
    	people[3].setAddress("“¿“‡Œ§“¿“‡s");
		

		// •\¦‚ğŒ©‚â‚·‚­‚·‚éˆ×‹ós‚ğo—Í
		System.out.println();
		for(int i = 0; i< people.length; i++){
			System.out.println(people[i].getName() + " " + 
			people[i].getAge() + " " + people[i].getAddress() );
		}

	}
}