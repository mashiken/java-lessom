public class Person{
	private String name;
	private int age;
	private String address;

	public Person(String _name,int _age,String _address) {
		name = _name;
		if(_age < 0){
			age = 0; 
		}else{
			age = _age;
		}
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
		// age -2�Γ����ۂɂ��蓾�Ȃ��N��̕ύX��if���Ŗh��
		if(_age > 0) {
			age = _age;
		}else{
			age = 0;
		}
	}

	public void setAddress(String _address){
		address = _address;
	}

}


