
class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[4];
		people[0] = new Person("���Y", 21, "�����s�`��");
		people[1] = new Person("�Ԏq",18,"�k�C���D�y�s");
		people[2] = new Boy("���Y", 9, "�����������s");
		people[3] = new Girl("���q", 8, "�{�錧���s");

		for(int i = 0; i < people.length; i++){
			people[i].say();
		}

		people[2].setName("�O�Y");
    	people[2].setAge(5);
    	people[2].setAddress("���ꌧ�ߔe�s");
    	people[3].setName("�~�q");
    	people[3].setAge(4);
    	people[3].setAddress("�����������s");
		

		// �\�������₷������׋�s���o��
		System.out.println();
		for(int i = 0; i< people.length; i++){
			System.out.println(people[i].getName() + " " + 
			people[i].getAge() + " " + people[i].getAddress() );
		}

	}
}