public class Person{
	private String name;
	private int age;
	private String address;

	public Person(String _name,int _age,String _address) {
		name = _name;
		age = _age;
		address = _address;
	}

	public void say(){
		System.out.println("���̖��O��" + name + "�ł��B�N���" + age 
		+ "�ΏZ����" + address + "�ł��B");
	}

	//private�ݒ�Œ��ڕύX���鎖�͕s��
	//public���\�b�h�Ɉ�����n���A�󂯎�����l�����\�b�h���ő������
	public void setName(String _name){
		name = _name;
	}

	public void setAge(int _age){
		age = _age;
	}

	public void setAddress(String _address){
		address = _address;
	}

}


