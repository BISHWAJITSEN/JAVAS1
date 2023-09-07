class Test1{
	public static void main(String[] args) {
		Address a1 = new Address(114, "C-DAC Street", "Hardware Park", "Hyderabad", 50005);
		Address p1 = new Person("ABC", 30, a1);
		p1.getPerson();
	}
}