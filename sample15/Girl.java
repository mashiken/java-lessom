class Girl extends Person{
	Girl(String _name,int _age,String _address){
		super(_name,_age,_address);
	}

	public void say(){
		System.out.println("�킽��" + name + "�ł��B�N��͓���("
    + age + ") " + address + "�ɏZ��ł܂��B");
	}
}