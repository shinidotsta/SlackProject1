package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class MainCus
{
    public static int regID=0;
	public static void main(String[] args) throws IOException
	{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Customer shini=new Customer();
		RoomBooking rb=new RoomBooking();
do {
		
		System.out.println("Enter your details");
		System.out.println("Enter Your Name");
		name=br.readLine();
		System.out.println("Enter Your address");
		address=br.readLine();
		System.out.println("Enter Contact No");
		contactNumber=br.readLine();
		System.out.println("Enter Email");
		email=br.readLine();
		System.out.println("Enter ProofType");
		proofType=br.readLine();
		System.out.println("Enter proofID");
		proofID=br.readLine();
		
		
		
		shini.setName(name);
		shini.setAddress(address);
		shini.setContactNumber(contactNumber);
		shini.setEmail(email);
		shini.setProofType(proofType);
		shini.setProofID(proofID);
		
        shini.register();
        System.out.println("Thankyou for your registration,Your registration ID will be:"+ ++regID);
        
        System.out.println("Do you want to continue?");
        str=br.readLine();

	}while(str.equalsIgnoreCase("Yes"));


rb.Booking();

}

}
