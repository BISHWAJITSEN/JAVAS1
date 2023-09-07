class Book{
	 String title;//instance variable
	int pages; //instance variable
	double price;
	static String org = "cdac";
	int xyz;
	Book(String title, int pages, double price,int xyz){
		this.title = title; //local variable
		this.pages = pages; //local variable
		this.price = price;
		this.xyz = xyz; 

		//title = title; //local variable
		//pages = pages; //local variable
		//price = price;
	}
		void akash(){

			System.out.println(xyz+" ");

		}
	
	void display(){
		System.out.println(title+" "+pages+" "+price+" "+org);
	}
	public static void main(String[] args) {
		Book b1 = new Book("JAVA", 500, 320,444);
		b1.display();
		b1.akash();                         
		Book b2 = new Book("DBMS", 700, 420,555);
		b2.display();
		b2.akash();

	}
}