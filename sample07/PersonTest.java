
class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("���Y", 21, "�����s�`��");
		people[1] = new Person("�Ԏq",18,"�k�C���D�y�s");
		people[2] = new Person("�Ԏq",18,"�k�C���D�y�s");

		people[1].setName("���Y");
		people[1].setAge(17);
		people[1].setAddress("�����������s");
		people[2].setName("�O�Y");
		people[2].setAge(15);
		people[2].setAddress("�{�錧���s");
		

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