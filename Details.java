class Details{
  int rollno;
  String name;
  int age;
 
 void setStud()
 {

   rollno=25;
   name="tejas";
   age=26;

 }
void getStud()
{
   System.out.println(rollno+" "+name+" "+age);
}
public class Person {
  
public static void main(String[] args) 
{
Details d1 = new Details();
d1.setStud();
d1.getStud(); 
}

	    }

     }