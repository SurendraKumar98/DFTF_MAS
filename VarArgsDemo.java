package day4;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo main = new VarArgsDemo();
		System.out.println("Add with no param:" + main.add());
		System.out.println("Add with one param:" + main.add(1));
		System.out.println("Add with multi param:" + main.add(10,20,30,40));


	}
/**
* var args (0 to n parameters of same data type)
*
* @param num
* @return
*/
int add(int ...num){ //varags parameter
int sum=0;
for (int n: num) {
sum = sum + n;
}
return sum;
}

}
