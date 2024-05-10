package oops.polytopic.runtime.task1;

import java.util.Scanner;

public class TestApp1 
{
	void getVehicleInfo(Vehicle vehicle) 
	{
		if(vehicle instanceof TwVehicle) 
		{
			// Downcasting
			TwVehicle twVehicle = (TwVehicle)vehicle;
			twVehicle.getTwModelInfo();
		}else if(vehicle instanceof LmvVehicle) 
		{
			// Downcasting
			LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
			lmvVehicle.getLmvModelInfo();
		}else if(vehicle instanceof HmvVehicle) 
		{
			// Downcasting
			HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
			hmvVehicle.getHmvModelInfo();
		}	
	}
	public static void main(String[] args) 
	{
//		Vehicle vehicle = null;
		
		// upcasting--->parent ref--child object
//		vehicle = new HmvVehicle();
//		vehicle.getSpec();
			
		
//		HmvVehicle hmv = new HmvVehicle();
		TestApp1 obj = new TestApp1();
//		obj.getVehicleInfo(hmv);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		
		Vehicle vehicle = null;
		switch(choice) 
		{
			case 1: // upcasting--->parent ref--child object
					vehicle = new TwVehicle();
					vehicle.getSpec();
					obj.getVehicleInfo(vehicle);
//					// Downcasting
					TwVehicle twVehicle = (TwVehicle)vehicle;
					twVehicle.getTwModelInfo();
					break;			
					
			case 2: vehicle = new LmvVehicle();
					vehicle.getSpec();
					obj.getVehicleInfo(vehicle);
					break;			
					
			case 3:	vehicle = new HmvVehicle();
					vehicle.getSpec();
					obj.getVehicleInfo(vehicle);
					break;
		}
	}
}