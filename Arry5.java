import java.util.Scanner;
class Arry5{
	public static void main(String[] args) {
		int[] arr=new int[25];
		for (int i=0; i<25; i++){
			arr[i]=1+(int)(Math.random()*100);
			System.out.print(arr[i]+ " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int x = input.nextInt();
		boolean flag=false;
		for(int i=0; i<arr.length; i++){
			if (x==arr[i]){
				flag=true;
				System.out.println(x+" is found at index "+i);
				break;
			}
		}
		if(flag==false)
		System.out.println(x+" is not found");
	}

}