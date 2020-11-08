// importでパッケージ名を省略できる。
// newの後完全修飾子で定義しなくても良い

import net.pgtop.test.Person;
// import net.pgtop.test.*; testフォルダの中にあるクラス全てが対象になる

public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("太郎", 21, "東京都港区");
		people[1] = new Person("花子",18,"北海道札幌市");
		people[2] = new Person("花子",-36,"北海道札幌市");

		for(int i = 0; i < people.length; i++){
			people[i].say();
		}

		people[1].setName("次郎");
		people[1].setAge(-17);
		people[1].setAddress("福岡県福岡市");
		people[2].setName("三郎");
		people[2].setAge(-15);
		people[2].setAddress("宮城県仙台市");
		

		// 表示を見やすくする為空行を出力
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

// java.lang パッケージに属しているクラスはimportしなくてもクラス名だけで
// 使用可能
// java.lang.String(正式) String.out.…(importしなくてOK)
// java.lang パッケージ以外は、標準で用意されているクラスライブラリでも
// importが必要