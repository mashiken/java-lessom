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
		System.out.println("���̖��O��" + name + "�ł��B�N���" + age 
		+ "�ΏZ����" + address + "�ł��B");
	}

}


class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Person("���Y", 21, "�����s�`��");
		people[1] = new Person("�Ԏq",18,"�k�C���D�y�s");

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