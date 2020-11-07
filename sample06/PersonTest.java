class Person{
	String name;
	int age;
	String address;

	Person(String _name,int _age,String _address) {
		name = _name;
		age = _age;
		address = _address;
	}

	void say(){
		System.out.println("„‚Ì–¼‘O‚Í" + name + "‚Å‚·B”N—î‚Í" + age 
		+ "ÎZŠ‚Í" + address + "‚Å‚·B");
	}

}


class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("‘¾˜Y", 21, "“Œ‹“s`‹æ");
		people[1] = new Person("‰Ôq",18,"–kŠC“¹D–ys");
		people[2] = new Person("‰Ôq",18,"–kŠC“¹D–ys");

		// ’l‚ğ•ÏX‚·‚é–‚ªo—ˆ‚é
		people[1].name = "Ÿ˜Y";
		people[1].age = 15;
		people[1].address = "•Ÿ‰ªŒ§•Ÿ‰ªs";
		people[2].name = "O˜Y";
		people[2].age = 25;
		people[2].address = "‹{éŒ§å‘äs";


		for(int i = 0; i< people.length; i++){
			people[i].say();
		}

		int[] num = new int[2];
		num[0] = 1;
		num[1] = 11;
		for(int i = 0; i< num.length; i++){
			System.out.println(num[i]);
		}
	}
}