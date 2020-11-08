package net.pgtop.test;

class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("‘¾˜Y", 21, "“Œ‹“s`‹æ");
		people[1] = new Person("‰Ôq",18,"–kŠC“¹D–ys");
		people[2] = new Person("‰Ôq",-36,"–kŠC“¹D–ys");

		for(int i = 0; i < people.length; i++){
			people[i].say();
		}

		people[1].setName("Ÿ˜Y");
		people[1].setAge(-17);
		people[1].setAddress("•Ÿ‰ªŒ§•Ÿ‰ªs");
		people[2].setName("O˜Y");
		people[2].setAge(-15);
		people[2].setAddress("‹{éŒ§å‘äs");
		

		// •\¦‚ğŒ©‚â‚·‚­‚·‚éˆ×‹ós‚ğo—Í
		System.out.println();
		for(int i = 0; i< people.length; i++){
			System.out.println(people[i].getName() + " " + 
			people[i].getAge() + " " + people[i].getAddress() );
		}

		int[] num = new int[2];
		num[0] = 1;
		num[1] = 11;
		for(int i = 0; i< num.length; i++){
			System.out.println(num[i]);
		}
	}
}