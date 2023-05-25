package Classes;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.*;

abstract class Date{
	public abstract void availableDate(); 

	public void defaultDate(){
		System.out.println("[1]Today \t [2]Tomorrow \t [3]The day after tomorrow");
	}

	public void defaultDate(String date){
		System.out.println("Only Date Available: "+date);
	}


}

public class ShowDate extends Date{
	
	private String day1="18/09/2020";
	private String day2="19/09/2020";
	private String day3="20/09/2020";
	private String day4="21/09/2020";
	private String day5="22/09/2020";
	private String day6="23/09/2020";

	public String getDay1(){
		return day1;
	}

	public String getDay2(){
		return day2;
	}

	public String getDay3(){
		return day3;
	}

	public String getDay4(){
		return day4;
	}

	public String getDay5(){
		return day5;
	}

	public String getDay6(){
		return day6;
	}


	public void availableDate(){
		System.out.println();
		System.out.println("PICK YOUR DATE...");
		System.out.println("[1] "+day1+"\t"+"[2] "+day2+"\t"+"[3] "+day3);
		System.out.println("[4] "+day4+"\t"+"[5] "+day5+"\t"+"[6] "+day6);

			int count2 =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("ENTER SERIAL NUMBER OF THE DATE: ");  
			int d= sc.nextInt(); 

			if(0<d && d<7){
			//System.out.println("Date Selected!");

				switch(d){
					case 1: System.out.println("DATE: "+getDay1()+" Selected*"); 

							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("DATE: "+getDay1()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 2: System.out.println("DATE: "+getDay2()+" Selected*");
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("DATE: "+getDay2()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 3: System.out.println("DATE: "+getDay3()+" Selected*"); 
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("DATE: "+getDay3()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							} 
					break;

					case 4: System.out.println("DATE: "+getDay4()+" Selected*");
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("DATE: "+getDay4()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							} 
					break;

					case 5: System.out.println("DATE: "+getDay5()+" Selected*");  
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("DATE: "+getDay5()+"\r\n");
							pr.close();
							br.close();
							fr.close();
							}catch(FileNotFoundException e){
								System.out.println();
								System.out.println("Exception: "+e);
							}
					break;

					case 6: System.out.println("DATE: "+getDay6()+" Selected*"); 
							try{
							FileWriter fr = new FileWriter("YOUR PURCHASE SLIP/Slip.txt", true);
							BufferedWriter br = new BufferedWriter(fr);
							PrintWriter pr = new PrintWriter(br);
							pr.println("DATE: "+getDay6()+"\r\n");
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
			count2 =2; 
			}
			else{
			System.out.println("Your selection is not from the above list!.. Try again...");
			}
			

			} catch(Exception exp){
			System.out.println();
			System.out.println("Exception: "+exp);
			System.out.println("You must have to enter integer Number between 1 to 6!");  
			}
		}while(count2==1); 
	}
}