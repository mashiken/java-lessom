class Person{
	String name;
	int age;
	String address;

	Person(String _name,int _age,String _address) {
		name = _name;
		age = _age;
		address = _address;
	}

}

// static�錾�����t�B�[���h�⃁�\�b�h�̓C���X�^���X�����Ȃ��Ă����p�\
class Hoge{
	public static String name = "�ۖё��Y";
	public static int age = 55;
	public static String address = "�����s�V�h��̕��꒬";

}

class PersonTest {
	public static void main(String[] args) {
		Person taro = new Person("���Y", 21, "�����s�`��");
		System.out.println("���O" + taro.name + " �N��:" + taro.age + " �Z��:" + 		taro.address);

		Person hanako = new Person("�Ԏq",18,"�k�C���D�y�s");
		System.out.println("���O" + hanako.name + " �N��:"+ hanako.age +" �Z��:"		 + hanako.address);
		
		
		System.out.println("���O" + Hoge.name + " �N��:"+ Hoge.age +" �Z��:"			+ Hoge.address);
	}
}