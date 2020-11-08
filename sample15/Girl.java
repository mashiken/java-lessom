class Girl extends Person{
	Girl(String _name,int _age,String _address){
		super(_name,_age,_address);
	}

	public void say(){
		System.out.println("‚í‚½‚µ" + name + "‚Å‚·B”N—î‚Í“à("
    + age + ") " + address + "‚ÉZ‚ñ‚Å‚Ü‚·B");
	}
}