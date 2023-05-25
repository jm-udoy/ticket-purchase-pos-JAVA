package Classes;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.*;

public class Payment{
	private long accountNum;
	private int pin;

	public long getAccNum(){
		return accountNum;
	}

	public int getPin(){
		return pin;
	}

	public void bkashPay(){
		
		int count =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("ENTER YOUR 11 DIGIT BKASH ACCOUNT NUMBER: ");  
			accountNum = sc.nextLong(); 

			int count2 = 0;

        		while(accountNum > 0) {
					accountNum = accountNum / 10;
					count2 = count2 + 1; 
					}

   					//System.out.println("Number of digits: " + count2);

					if(count2==10){
						int count3=1;
						do{
							try{
							Scanner sc1 = new Scanner(System.in);
							System.out.println();
							System.out.print("ENTER YOUR PIN: ");  
							pin = sc1.nextInt();
							System.out.println();
							System.out.println("YOU WANT TO CONFIRM YOUR PAYMENT? [1] YES   [2] NO");
							

									int count4=1;
									do{
										try{
											Scanner sc2 = new Scanner(System.in);
											System.out.println();
											System.out.print("ENTER YOUR CHOICE: ");  
											int t= sc2.nextInt();


											if(0<t && t<3){
												switch(t){
													case 1: 
															System.out.println();
															System.out.println("***YOUR PAYMENT IS CONFIRMED!***"); 
															System.out.println();
															System.out.println("CHECK YOUR PURCHASE SLIP IN THE (YOUR PURCHASE SLIP) FOLDER...");
															System.out.println();
															System.out.println("-----THANK YOU FOR CHOOSING GALAXY CINEPLEX-----"); 
															System.out.println("See you in the theater... Till then stay safe, stay cool...");

															try{
															FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br = new BufferedWriter(fr);
															PrintWriter pr = new PrintWriter(br);
															pr.println("***PAYMENT IS DONE USING BKASH***  \r\n");
															pr.println("\r\n");
															pr.println("-----THANK YOU FOR CHOOSING GALAXY CINEPLEX-----  \r\n");
															pr.println("See you in the theater... Till then stay safe, stay cool...  \r\n");
															pr.close();
															br.close();
															fr.close();
															}catch(FileNotFoundException e){
																System.out.println();
																System.out.println("Exception: "+e);
															}
													break;

													case 2: 
															System.out.println();
															System.out.println("PAYMENT CANCELED");
															try{
															FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br = new BufferedWriter(fr);
															PrintWriter pr = new PrintWriter(br);
															pr.println("YOUR PAYMENT IS CANCELED...");
															pr.println("PLEASE MAKE YOUR PAYMENT TO CONFIRM BOOKING...");
															pr.close();
															br.close();
															fr.close();
															}catch(FileNotFoundException e){
																System.out.println();
																System.out.println("Exception: "+e);
															}
													break;
												default:System.out.println("Not in the list!");  
												}
											count4 =2; 
											}
											else{
											System.out.println("Your selection is not from the above list!.. Try again...");
											}
										}catch(Exception e){
											System.out.println();
											System.out.println("Exception: "+e);
											System.out.println("You must have to enter integer Number between 1 to 2!");	
										}
									}while(count4==1);
 

							count3=2;

						}catch(Exception exp1){
							System.out.println(exp1);
							}
						}while(count3==1);

				
					
					count =2; 
					}
					else{
					System.out.println("Please enter a valid account number!.. Try again...");
					}
			

				} catch(Exception exp){
				System.out.println();
				System.out.println("Exception: "+exp);
				System.out.println("You must have to enter 11 digits of your account number!");  
				}
		}while(count==1);
	}




	public void creditCardPay(){
		int count =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("ENTER YOUR 16 DIGIT CREDIT CARD NUMBER: ");  
			accountNum = sc.nextLong(); 

			int count2 = 0;

        		while(accountNum > 0) {
					accountNum = accountNum / 10;
					count2 = count2 + 1; 
					}

   					//System.out.println("Number of digits: " + count2);

					if(count2==16){
						int count3=1;
						do{
							try{
							Scanner sc1 = new Scanner(System.in);
							System.out.println();
							System.out.print("ENTER YOUR PIN: ");  
							pin = sc1.nextInt();
							System.out.println();
							System.out.println("YOU WANT TO CONFIRM YOUR PAYMENT? [1] YES   [2] NO");
							

									int count4=1;
									do{
										try{
											Scanner sc2 = new Scanner(System.in);
											System.out.println();
											System.out.print("ENTER YOUR CHOICE: ");  
											int t= sc2.nextInt();


											if(0<t && t<3){
												switch(t){
													case 1: 
															System.out.println();
															System.out.println("***YOUR PAYMENT IS CONFIRMED!***"); 
															System.out.println();
															System.out.println("CHECK YOUR PURCHASE SLIP IN THE (YOUR PURCHASE SLIP) FOLDER...");
															System.out.println();
															System.out.println("-----THANK YOU FOR CHOOSING GALAXY CINEPLEX-----"); 
															System.out.println("See you in the theater... Till then stay safe, stay cool...");

															try{
															FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br = new BufferedWriter(fr);
															PrintWriter pr = new PrintWriter(br);
															pr.println("***PAYMENT IS DONE USING CREDIT CARD***  \r\n");
															pr.println("\r\n");
															pr.println("-----THANK YOU FOR CHOOSING GALAXY CINEPLEX-----  \r\n");
															pr.println("See you in the theater... Till then stay safe, stay cool...  \r\n");
															pr.close();
															br.close();
															fr.close();
															}catch(FileNotFoundException e){
																System.out.println();
																System.out.println("Exception: "+e);
															}
													break;

													case 2: 
															System.out.println();
															System.out.println("PAYMENT CANCELED");
															try{
															FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
															BufferedWriter br = new BufferedWriter(fr);
															PrintWriter pr = new PrintWriter(br);
															pr.println("YOUR PAYMENT IS CANCELED...");
															pr.println("PLEASE MAKE YOUR PAYMENT TO CONFIRM BOOKING...");
															pr.close();
															br.close();
															fr.close();
															}catch(FileNotFoundException e){
																System.out.println();
																System.out.println("Exception: "+e);
															}
													break;
												default:System.out.println("Not in the list!");  
												}
											count4 =2; 
											}
											else{
											System.out.println("Your selection is not from the above list!.. Try again...");
											}
										}catch(Exception e){
											System.out.println();
											System.out.println("Exception: "+e);
											System.out.println("You must have to enter integer Number between 1 to 2!");	
										}
									}while(count4==1);
 

							count3=2;

						}catch(Exception exp1){
							System.out.println(exp1);
							}
						}while(count3==1);

				
					
					count =2; 
					}
					else{
					System.out.println("Please enter a valid account number!.. Try again...");
					}
			

				} catch(Exception exp){
				System.out.println();
				System.out.println("Exception: "+exp);
				System.out.println("You must have to enter 16 digits of your credit card number!");  
				}
		}while(count==1);
	}



	public void makePayment(){
		System.out.println();
		System.out.println("MAKE PAYMENT USING...");
		System.out.println("[1] Credit Card \t [2] Bkash ");

		int count5 =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("ENTER YOUR CHOICE: ");  
			int t= sc.nextInt(); 

			if(0<t && t<3){
				switch(t){
					case 1: creditCardPay(); 
					break;

					case 2: bkashPay();
					break;
				default:System.out.println("Not in the list!");  
				}
			count5 =2; 
			}
			else{
			System.out.println("Your selection is not from the above list!.. Try again...");
			}
			

			} catch(Exception exp){
			System.out.println();
			System.out.println("Exception: "+exp);
			System.out.println("You must have to enter integer Number between 1 to 2!");  
			}
		}while(count5==1);
	}
}