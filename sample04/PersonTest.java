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
		System.out.println("私の名前は" + name + "です。年齢は" + age 
		+ "歳住所は" + address + "です。");
	}

}

// static宣言したフィールドやメソッドはインスタンス化しなくても利用可能
class Hoge{
	public static String name = "保毛太郎";
	public static int age = 55;
	public static String address = "東京都新宿区歌舞伎町";

	public static void nameAgeChange(String _name, int _age){
		name = _name;
		age = _age + 30;
	}

}

class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Person("太郎", 21, "東京都港区");
		people[1] = new Person("花子",18,"北海道札幌市");

		people[0].say();
		people[1].say();

		int[] num = new int[2];
		num[0] = 1;
		num[1] = 11;
		System.out.println(num[1]);
		
		Hoge.nameAgeChange("huga",30);
		System.out.println("名前" + Hoge.name + " 年齢:"+ Hoge.age +" 住所:"			+ Hoge.address);
	}
}