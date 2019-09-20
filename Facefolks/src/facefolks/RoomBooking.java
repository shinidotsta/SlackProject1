package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;



public class RoomBooking 
{
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	Date date;
	public static int roomID=0;
	
	static int charge=0;
	


public void Booking() throws IOException
{
	ListbookedRooms lbr=new  ListbookedRooms();
    System.out.println("Booking");
    System.out.println("Please choose the services required.");
    
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Which room you want AC/non-AC  (AC/nAC)");
	this.ac=br.readLine();
	System.out.println("Cot(Single/Double)");
	this.cot=br.readLine();
	System.out.println("With cable connection/without cable connection(C/nC)");
	this.cable=br.readLine();
	System.out.println("Wi-Fi needed or not(W/nW)");
	this.wifi=br.readLine();
	System.out.println("Laundry service needed or not(L/nL)");
	this.laundry=br.readLine();
  
	
	CalculateCharge();
	servicesRoom();
	servicesHotel();
	
	  System.out.println("Do you want to continue?");
	  String strroom=br.readLine();
	  if(strroom.equalsIgnoreCase("Yes"))
	  {
		  System.out.println("Thank you for booking. Your room number is"+""+(++roomID));
		 // ListbookedRooms lbr=new ListbookedRooms();
		 lbr.roomArray(roomID);
		  lbr.displayBasic();
	  } 	
}


public int getRoomID() 
{
	return roomID;
}

public void CalculateCharge()
{
	if((this.ac).equals("AC"))
	{
		charge=charge+1000;
	}
	else
	if((this.ac).equalsIgnoreCase("nAC"))
	{
		charge=charge+750;
	}
	
	if((this.cot).equalsIgnoreCase("Single"))
	{
		charge=charge+0;
	}
	else
	if((this.cot).equalsIgnoreCase("Double"))
		{
		charge=charge+350;
		}
		
	if((this.cable).equalsIgnoreCase("C"))
	{
		charge=charge+50;
	}
	else
   if((this.cable).equalsIgnoreCase("nC"))
		{
	   charge=charge+0;
		}
	
	
	if((this.wifi).equalsIgnoreCase("W"))
	{
		charge=charge+200;
	}
	else
   if((this.wifi).equalsIgnoreCase("nW"))
		{
	   charge=charge+0;
		}
	if((this.wifi).equalsIgnoreCase("L"))
	{
		charge=charge+100;
	}
	else
   if((this.wifi).equalsIgnoreCase("nL"))
		{
	   charge=charge+0;
		}
	System.out.println("The total charge is Rs."+""+charge);
}

public void servicesRoom()
{
	System.out.println("The services chosen are");
	if((this.cot).equalsIgnoreCase("Single") && (this.ac).equalsIgnoreCase("AC"))
	{
		System.out.println("Single cot AC room");
	}
	else
		if((this.cot).equalsIgnoreCase("Single") && (this.ac).equalsIgnoreCase("nAC"))
		{
			System.out.println("Single Cot non-AC room");
		}
	else
	if((this.cot).equalsIgnoreCase("Double") && (this.ac).equalsIgnoreCase("AC"))
	{
		System.out.println("Double Cot AC room");
	}
	else
		if((this.cot).equalsIgnoreCase("Double") && (this.ac).equalsIgnoreCase("nAC"))
		{
			System.out.println("Double Cot Non-AC room");
		}
}

public void servicesHotel()
{
	if((this.cable).equalsIgnoreCase("C"))
	{
		System.out.println("Cable connection enabled");
	}
	else
   if((this.cable).equalsIgnoreCase("nC"))
		{
	   System.out.println("No Cable connection enabled");
		}
	if((this.wifi).equalsIgnoreCase("W"))
	{
		System.out.println("Wi-Fi enabled");
	}
	else
   if((this.wifi).equalsIgnoreCase("nW"))
		{
	   System.out.println("No Wi-Fi enabled");
		}
	if((this.laundry).equalsIgnoreCase("L"))
	{
		System.out.println("with laundry service");
	}
	else
   if((this.laundry).equalsIgnoreCase("nL"))
		{
	   System.out.println("with no laundry service");
		}
}


}
