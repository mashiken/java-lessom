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
		Person[] people = new Person[3];
		people[0] = new Person("���Y", 21, "�����s�`��");
		people[1] = new Person("�Ԏq",18,"�k�C���D�y�s");
		people[2] = new Person("�Ԏq",18,"�k�C���D�y�s");

		// �l��ύX���鎖���o����
		people[1].name = "���Y";
		people[1].age = 15;
		people[1].address = "�����������s";
		people[2].name = "�O�Y";
		people[2].age = 25;
		people[2].address = "�{�錧���s";


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