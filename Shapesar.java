import java.util.Scanner;
abstract class Shape{
int l,b;
shape(int a1,int a2){
a1=l;
a2=b;
abstract void printArea();
}
}
class rectangle extends Shape{
rectangle(int length,int breadth)
super(a1,a2);
}
void printArea(){
int rec=a1*a2;
System.out.println("Areaof the rectangle:"rec);
}
classTriangleextends Shape{
Triangle(int base,int height)
super(a1,a2);
}
void printArea(){
int tri=0.5*a1*a2;
System.out.println(*"Area of the triangle:"+tri);
}
class circle extends Shape{
circle(int radius)
super(radius,0)
}
void printArea(){
double area=Math.pi*radius*radius;

System.out.println("Area of the circle:"+area);
}
public class Shapear{
public static void main(String[] args)
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("1.Shapes:");
System.out.printl("2.Rectangle:");
System.out.println("3.Triangle:");
System.out.println("4.circle:");
System.out.println("____");
System.out.println("Enter the choice: ");
choice=sc.nextInt();
switch(choice)
case1:
System.out.println("Enter the length of the rectangle:");
int length=sc.nextInt();
System.out.println("Enter the breadth of the rectangle:");
int breadth=sc.nextInt();
int rec=length*breadth;
System.out.println("Area of the rectangle:"+rec);
break;
case 2:
System.out.println("Enter the base of the triangle:");
int base=sc.nextInt();
System.out.println("Enter the height of the triangle:");
int height=sc.nextInt();
int tri=0.5*base*height;
System.out.println("Area of the triangle:"+tri);
break;
case 3:
System.out.println("Enter the radius of the circle:");
double cir=Math.pi*radius*radius;
System.out.println("Area of the circle:"+cir);
break;
case4:
System.out.println("Exit");
default:
System.out.println("Invalid");
}
}




