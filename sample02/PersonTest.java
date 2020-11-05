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
		System.out.println("名前" + name + " 年齢:" + age + " 住所:" + address);
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
		Person taro = new Person("太郎", 21, "東京都港区");
		taro.say();

		Person hanako = new Person("花子",18,"北海道札幌市");
		hanako.say();
		
		Hoge.nameAgeChange("huga",30);
		System.out.println("名前" + Hoge.name + " 年齢:"+ Hoge.age +" 住所:"			+ Hoge.address);
	}
}