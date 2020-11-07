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

// static�錾�����t�B�[���h�⃁�\�b�h�̓C���X�^���X�����Ȃ��Ă����p�\
class Hoge{
	public static String name = "�ۖё��Y";
	public static int age = 55;
	public static String address = "�����s�V�h��̕��꒬";

	public static void nameAgeChange(String _name, int _age){
		name = _name;
		age = _age + 30;
	}

}

class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Person("���Y", 21, "�����s�`��");
		people[1] = new Person("�Ԏq",18,"�k�C���D�y�s");

		people[0].say();
		people[1].say();

		int[] num = new int[2];
		num[0] = 1;
		num[1] = 11;
		System.out.println(num[1]);
		
		Hoge.nameAgeChange("huga",30);
		System.out.println("���O" + Hoge.name + " �N��:"+ Hoge.age +" �Z��:"			+ Hoge.address);
	}
}