package Classes;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.*;

interface ShowOne{

	void showTimeOne();

}

interface ShowTwo{

	void showTimeTwo();

}

interface ShowThree{

	void showTimeThree();

}

public class ShowTime implements ShowOne,ShowTwo,ShowThree{
	
	private String time1="11:00 AM";
	private String time2="12:15 PM";
	private String time3="03:10 PM";
	private String time4="04:30 PM";
	private String time5="07:00 PM";

	public String getTime1(){
		return time1;
	}

	public String getTime2(){
		return time2;
	}

	public String getTime3(){
		return time3;
	}

	public String getTime4(){
		return time4;
	}

	public String getTime5(){
		return time5;
	}



	public void showTimeOne(){

		System.out.println();
		System.out.println("AVAILABLE SHOW TIME...");
		System.out.println("[1] "+time1+"\t"+"[2] "+time2);
		System.out.println("[3] "+time3+"\t"+"[4] "+time4);

		int count3 =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("PICK YOU SHOW TIME: ");  
			int t= sc.nextInt(); 

			if(0<t && t<5){
				switch(t){
					case 1: System.out.println("SHOW TIME: "+getTime1()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime1()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 2: System.out.println("SHOW TIME: "+getTime2()+" Selected*");
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime2()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 3: System.out.println("SHOW TIME: "+getTime3()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime3()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 4: System.out.println("SHOW TIME: "+getTime4()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime4()+"\r\n");
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
			count3 =2; 
			}
			else{
			System.out.println("Your selection is not from the above list!.. Try again...");
			}
			

			} catch(Exception exp){
			System.out.println();
			System.out.println("Exception: "+exp);
			System.out.println("You must have to enter integer Number between 1 to 4!");  
			}
		}while(count3==1);

	}

	public void showTimeTwo(){

		System.out.println();
		System.out.println("AVAILABLE SHOW TIME...");
		System.out.println("[1] "+time2+"\t"+"[2] "+time3+"\t"+"[3] "+time4);

		int count3 =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("PICK YOU SHOW TIME: ");  
			int t= sc.nextInt(); 

			if(0<t && t<4){
				switch(t){
					case 1: System.out.println("SHOW TIME: "+getTime2()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime2()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 2: System.out.println("SHOW TIME: "+getTime3()+" Selected*");
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime3()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 3: System.out.println("SHOW TIME: "+getTime4()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime4()+"\r\n");
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
			count3 =2; 
			}
			else{
			System.out.println("Your selection is not from the above list!.. Try again...");
			}
			

			} catch(Exception exp){
			System.out.println();
			System.out.println("Exception: "+exp);
			System.out.println("You must have to enter integer Number between 1 to 3!");  
			}
		}while(count3==1);
		

	}

	public void showTimeThree(){

		System.out.println();
		System.out.println("AVAILABLE SHOW TIME...");
		System.out.println("[1] "+time1+"\t"+"[2] "+time3);

		int count3 =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("PICK YOU SHOW TIME: ");  
			int t= sc.nextInt(); 

			if(0<t && t<3){
				switch(t){
					case 1: System.out.println("SHOW TIME: "+getTime1()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime1()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 2: System.out.println("SHOW TIME: "+getTime3()+" Selected*");
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("SHOW TIME: "+getTime3()+"\r\n");
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