
package day3;/**
*
* To demonstrate a class creation with variables, methods
*
* Topic: Core Java
*
* Day#: 3
*
* @author anbarasuv(40102044)
*
*/
class Room {
//Class variables/fields/properties/attributes
int roomNo;
String roomType;
float roomArea;
boolean acMachine;
/**
* This method is used to set the values for the class variables
*
* @param roomNo
* @param roomType
* @param roomArea
* @param acMachine
*/
public void setData(int roomNo, String roomType, float roomArea, boolean acMachine){
this.roomNo = roomNo;
this.roomType = roomType;
this.roomArea = roomArea;
this.acMachine = acMachine;
}
/**
* This method is used to display the values of the class variables
*/
public void displayData()
{
/*
* Printing the room number room type room area and AC availability
*/
System.out.println("My Room No:" + this.roomNo);
System.out.println("My Room Type:" + this.roomType);
System.out.println("My Room Area:" + this.roomArea + " sq. feet");
//System.out.println("My Room has AC:" + this.acMachine);
//or
System.out.println(this.acMachine?"My Room has AC.":"My Room does not have AC.");
//ternary operator -> condition?if true code statement:else code
//condition a>1, a>b, a="Anbu"....
//if find smallest two numbers a, b
//c = a>b?b:a;
//c = a<b?a:b;
}
}

