import java.util.Arraylist;
import java.util.Scanner;
public class contactmanager{
public static void main(String[]args)
{
Scanner re=new Scanner(System.in);
ArrayList<String>contacts=new ArrayList<>();
ArrayList<String>contacts=new ArrayList<>();
while(true){
System.out.println("\n__Contact Manager System__");
System.out.println("Add Contact");
System.out.println("View contacts");
System.out.println("Search the contact details");
System.out.println("Update the details:");
System.out.println("Delete the details:");
System.out.println("Exit the contact details:");
System.out.println("Choose the option:");
int choice=re.nextInt();
re.nextLine();
if(choice==1)
{
System.out.println("Enter the contact name to add");
String name=re.nextLine();
System.out.println("Enter the contact number: ");
int number=re.nextInt();

contacts.add(name);
System.out.println("Addedcontact");
}
else if(choice==2)
{
System.out.println("Contact List:");
for(String name:contacts)
{
System.out.println("-"+name);
}
if(contacts.isempty())
{
System.out.println("No contacts found");
}
else if(choice==3)
{
System.out.println("Enter the name to search:");
String search=re.nextLine();
boolean found=false;
for(String name:contacts){
if(name.tolowercase().contains(search.tolowercase()))
{
System.out.println("Found:"+name);
found=true;
}
}
if(!found)
{
System.out.println("Contacts not found");
}
}
else if(Choice==4)
{
System.out.println("Enter the name update:");
String name=re.nextLine();
if(contacts.contains(oldname))
{
System.out.println("Enter the new name:");
String NewName=re.nextLine();
int index=contacts.indexof(oldname);
contacts.set(index,NewName);
System.out.println("Contact updated");
}
else
{
System.out.println("Contact not found");
}
else if(choice==5)
{
System.out.println("Enter the name to delete:");

String deletename=re.nextLine();
if(contacts.remove(deletename))
{
System.out.println("Contact deleted");
}
else
{
System.out.println("Contact not  found");
}
}
else if(choice==6)
{
System.out.println("Entering program");
break;
}
else
{
System.out.println("Invalid");
}
}
Sc.close();
}
}
}
}
}
