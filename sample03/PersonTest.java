class Person{
	String name;
	int age;
	String address;

	Person(String _name,int _age,String _address) {
		name = _name;
		age = _age;
		address = _address;
	}

	String say(){
		String str = "���̖��O��" + name + "�ł��B�N���" + age + "�΂ŏZ����" + 		address + "�ł��B";
		return str;
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
		Person taro = new Person("���Y", 21, "�����s�`��");
		System.out.println(taro.say());

		Person hanako = new Person("�Ԏq",18,"�k�C���D�y�s");
		System.out.println(hanako.say());
		
		Hoge.nameAgeChange("huga",30);
		System.out.println("���O" + Hoge.name + " �N��:"+ Hoge.age +" �Z��:"			+ Hoge.address);
	}
}