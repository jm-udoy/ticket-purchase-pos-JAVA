package Classes;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.*;

public class Ticket{

	private String tc1="REGULAR";
	private String tc2="PREMIUM";
	private int quantity;

	public void setQuantity(int q){
		quantity=q;
	}

	public int getQuantity(){
		return quantity;
	}

	public String getTCone(){
		return tc1;
	}

	public String getTCtwo(){
		return tc2;
	}


	public void bookTicket(){

		System.out.println();
		System.out.println("TICKET TYPES...");
		System.out.println("[1] "+tc1+" (350 TK)\t"+"[2] "+tc2+" (450 TK)");

		
		int count3 =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("SELECT YOUR TICKET TYPE: ");  
			int t= sc.nextInt(); 

			if(0<t && t<3){
				switch(t){
					case 1: System.out.println("TICKET TYPE: "+getTCone()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("TICKET TYPE: "+getTCone()+"\r\n");
							pr.close();
							br.close();
							fr.close();

										int count4 =1;
										do{
											try{
												Scanner qc = new Scanner(System.in);
												System.out.println();
												System.out.print("ENTER TICKET QUANTITY: ");  
												quantity= qc.nextInt(); 

													if(0<quantity && quantity<21){
														System.out.println("TICKET QUANTITY: "+quantity+" Confirmed*");


														try{
															FileWriter fr1 = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br1 = new BufferedWriter(fr1);
															PrintWriter pr1 = new PrintWriter(br1);
															pr1.println("TICKET QUANTY: "+quantity+"\r\n");
															pr1.close();
															br1.close();
															fr1.close();
															}catch(FileNotFoundException e2){
																System.out.println();
																System.out.println("Exception: "+e2);
															}

														System.out.println("----------------------------------");
														System.out.println("TOTAL AMOUNT: "+quantity*350+" TK");
														System.out.println("----------------------------------");

														try{
															FileWriter fr2 = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br2 = new BufferedWriter(fr2);
															PrintWriter pr2 = new PrintWriter(br2);
															pr2.println("--------------------------\r\n");
															pr2.println("TOTAL AMOUNT: "+quantity*350+" TK\r\n");
															pr2.println("--------------------------\r\n");
															pr2.close();
															br2.close();
															fr2.close();
															}catch(FileNotFoundException e3){
																System.out.println();
																System.out.println("Exception: "+e3);
															}



											 			count4 =2; 
													}else{
														System.out.println("Your cannot book more than 20 ticket!.. Try again...");
													}

										
												}catch(Exception exp){
													System.out.println();
													System.out.println("Exception: "+exp);
													System.out.println("You must have to enter integer Number between 1 to 20!");  
												}
													

											}while(count4==1); 
								}catch(FileNotFoundException e){
											System.out.println();
											System.out.println("Exception: "+e);
											} 
							
					break;

					case 2: System.out.println("TICKET TYPE: "+getTCtwo()+" Selected*");
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("TICKET TYPE: "+getTCtwo()+"\r\n");
							pr.close();
							br.close();
							fr.close();

								int count5 =1;
										do{
											try{
												Scanner qc = new Scanner(System.in);
												System.out.println();
												System.out.print("ENTER TICKET QUANTITY: ");  
												quantity= qc.nextInt(); 

													if(0<quantity && quantity<21){
														System.out.println("TICKET QUANTITY: "+quantity+" Confirmed*");


														try{
															FileWriter fr1 = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br1 = new BufferedWriter(fr1);
															PrintWriter pr1 = new PrintWriter(br1);
															pr1.println("TICKET QUANTY: "+quantity+"\r\n");
															pr1.close();
															br1.close();
															fr1.close();
															}catch(FileNotFoundException e2){
																System.out.println();
																System.out.println("Exception: "+e2);
															}

														System.out.println("----------------------------------");
														System.out.println("TOTAL AMOUNT: "+quantity*450+" TK");
														System.out.println("----------------------------------");

														try{
															FileWriter fr2 = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br2 = new BufferedWriter(fr2);
															PrintWriter pr2 = new PrintWriter(br2);
															pr2.println("--------------------------\r\n");
															pr2.println("TOTAL AMOUNT: "+quantity*450+" TK\r\n");
															pr2.println("--------------------------\r\n");
															pr2.close();
															br2.close();
															fr2.close();
															}catch(FileNotFoundException e3){
																System.out.println();
																System.out.println("Exception: "+e3);
															}



											 			count5 =2; 
													}else{
														System.out.println("Your cannot book more than 20 ticket!.. Try again...");
													}

										
												}catch(Exception exp){
													System.out.println();
													System.out.println("Exception: "+exp);
													System.out.println("You must have to enter integer Number between 1 to 20!");  
												}
													

											}while(count5==1); 


							}catch(FileNotFoundException e4){
								System.out.println();
								System.out.println("Exception: "+e4);
							}
					break;
				default:System.out.println("Not in the list!");  
				}
			count3 =2; 
			}
			else{
			System.out.println("Your selection is not from the above list!.. Try again...");
			}
			

			} catch(Exception exp){
			System.out.println();
			System.out.println("Exception: "+exp);
			System.out.println("You must have to enter integer Number between 1 to 2!");  
			}
		}while(count3==1); 
	}


}