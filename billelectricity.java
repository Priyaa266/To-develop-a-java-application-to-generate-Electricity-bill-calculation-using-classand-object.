import java.util.*;
public class billelectricity{
public static void main(String args[]){
Scanner re=new Scanner(System.in);
int consumernum;
String consumerName;
int prevread;
int currread;
String connectiontype;
int units;
double billamount=0;
System.out.print("Enter the consumer number:");
consumernum=re.nextInt();
re.nextLine();
System.out.print("Enter the consumer name:");
consumerName=re.nextLine();
System.out.print("Enter the previous reading:");
prevread=re.nextInt();
System.out.print("Enter the current reading:");
currread=re.nextInt();
re.nextLine();
System.out.print("Enter the connection type whether it is domestic/commercial: ");
connectiontype=re.nextLine();
units=currread-prevread;
if(connectiontype.equalsIgnoreCase("Domestic"))
{
if(units<=100)
{
billamount=units*1;
}
else if(units<=200){
billamount=100*1+(units-100)*2.5;
}
else if(units<=500)
{
billamount=100*1+100*2.5+(units-200)*4;
}
else
{
billamount=100*1+100*2.5+500*4+(units-500)*6;
}}
else if(connectiontype.equalsIgnoreCase("Commercial"))
{
if(units<=100)
{
billamount=units*2;
}
else if(units<=200)
{
billamount=100*2+(units-100)*4.5;
}

else if(units<=500)
{
billamount=100*2+100*4.5+300*6+(units-500)*7;
}
else
{
System.out.print("INvalid input");
}}

System.out.println("\n__Electricity bill__");
System.out.println("Consumer Number:"+consumernum);
System.out.println("Consumer Name:"+consumerName);
System.out.println("Connection type:"+connectiontype);

System.out.println("Previous Reading:"+prevread);
System.out.println("Current Reading"+currread);
System.out.println("UNits consumed:"+units);
System.out.print("Totalbillamount:Rs"+billamount);
}
}












