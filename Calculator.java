class Calculator
{

static int num1;

int num2;
public static void main(String args[])
{
Calculator obj4 = new Calculator();
System.out.println("Main method");
int ans = sum(10, 20);
System.out.println("Sum: "+ ans);
Calculator obj1 = new Calculator();
Calculator obj2 = new Calculator();
Calculator obj3 = new Calculator();
System.out.println("static num1: "+ num1);
System.out.println("non-static num2: "+ obj1.num2);

}
static int sum(int n1, int n2)

{
return n1+n2;
}
static {
System.out.println("Static block1");
}
static {
System.out.println("Static block2");
}

{
System.out.println("Non Static block 1");
{
}
System.out.println("Non Static block 2");{
}
System.out.println("Non Static block 3");{
}
}




}


