class Boy extends Person{
	Boy(String _name,int _age,String _address){
		super(_name,_age,_address);
	}

	public void say(){
		System.out.println("�ڂ�" + name + "�B�N���"
    	+ age + "�˂Ȃ񂾁B" + address + "�ɏZ��ł�񂾂�B");
	}
}