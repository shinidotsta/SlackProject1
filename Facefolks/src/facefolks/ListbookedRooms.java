package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;


public class ListbookedRooms 
{
	public static int RoomID;
	static int i=0;
	int avlRoom;
	static int booked[]=new int[25];
	
	RoomBooking rb=new RoomBooking();
	//RoomID=rb.getRoomID();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);

	 
	
	public void displayBasic() throws IOException 
	{
		String str;
	do
	{
		System.out.println("Menu");
		System.out.println("1.Booking");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			//RoomBooking rb=new RoomBooking();
			rb.Booking();
			break;
		case 2:
			System.out.println("Enter Room Number");
			avlRoom=sc.nextInt();
			CheckStatus(avlRoom);
			break;
		case 3:
			System.exit(0);;
			
		}
		System.out.println("Do you want to proceed?");

		
		str=br.readLine();
	}while(str.equalsIgnoreCase("Yes"));
		
	}
	public  void roomArray(int RoomID)
	{
		//System.out.println(RoomID);
		//System.out.println(i);
		    
			//if(booked[i]!=RoomID)
			booked[i++]=RoomID;
		
			/*
		
			*/
		   
			
	}

	public void CheckStatus(int avlRoom)
	{
		
		int flag=1;
		for(int j=0;j<25;j++)
		{
			if(booked[j]==avlRoom)
			{
				flag=1;
			    break;
			}
			else 
				flag=0;
		}
		if(flag==1)
			System.out.println("Already Booked");
		else
			System.out.println("Not Booked");
	}

}
