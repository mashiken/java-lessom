class Girl extends Person{
	Girl(String _name,int _age,String _address){
		super(_name,_age,_address);
	}

	public void say(){
		System.out.println("わたし" + name + "です。年齢は内緒("
    + age + ") " + address + "に住んでます。");
	}
}