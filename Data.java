// Note : Save the program in java extension(Data.java) and run on Commant Prompt


package cal;
import java.util.*;

class Data {
	
	public static void main(String args[]) {
	

		Scanner sc=new Scanner(System.in);
		
		//Accepting Values from User : 
	
		System.out.println("Enter Item Details : \t\t");
	
		System.out.print("Enter Item name : \t\t");
		String iname = sc.nextLine();
	
		System.out.print("Enter Item Type : \t\t");
		String itype = sc.nextLine();
	
		System.out.print("Enter Item Price : \t\t");
		Float iprice = sc.nextFloat();
	
		System.out.print("Enter Item Quantity :\t\t ");
		double iquantity = sc.nextDouble();

					// Logic Section	:
		//RAW Value adding
				double i;
				i= (iprice*12.5)/100;    //Raw: 12.5% of the item cost  (Given Statement)
	//			System.out.println(i);
				double raw = i + iprice;    		//(item cost + 12.5% of item cost)
		
				
				
				
		// Manufactured Value adding
				
				double j,  manf;
				j=(raw *2)/100;			// 2% of (item cost + 12.5% of item cost)  
				//System.out.println(j);
				manf =(float) i + j;			// Manufactured: 12.5% of the item cost + 2% of (item cost + 12.5% of item cost) (Given Statement)
				
				 
		double value_item= manf + raw ;		// value_item is the price of 
		
		
				// Imported: 10% import duty on item cost + a surcharge (surcharge is: Rs. 5 if the final cost after applying tax & import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it exceeds 200).

		
		        manf = 10.0 / 100 * value_item;
		        if (manf <= 100) manf += 5;
		        else if (manf >= 100 && manf <= 200) manf += 10;
		        else manf += 5.0 / 100 * (manf + value_item); // 5% of final cost which means original price + tax
		   
				
					//Output
		        
		        	System.out.println();
		        	System.out.println("After Including Tax");
		        	
		        		System.out.println(" Item Name : "+ iname);
		        		System.out.println(" Item Type : "+ itype);
		        		System.out.println(" Item Price : "+ iprice);
		        		System.out.println(" Item Quantity : "+ iquantity);
		        		System.out.println(" Raw Tax: "+raw);
		        		System.out.println(" Manufactured tax :"+manf);
		        		
		        		if (iquantity== 1){
		        			System.out.println("/n Item Value after including Tax is "+value_item);
		        		}
		        		
		        		else if (iquantity > 1) {
		        			value_item = value_item * iquantity;
		        			System.out.println("Item Value after including Tax is "+value_item);
		        		}
			
							
		
	}
}
