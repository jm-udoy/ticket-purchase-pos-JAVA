import Classes.*;
import java.util.*;  
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;	// Calling Util Formatter package to open and writting in the file...
public class Start{
	public static void main(String[] args){

		System.out.println();
		System.out.println("#####-----WELCOME TO GALAXY CINEPLEX-----#####");
		System.out.println();
		System.out.println("NOW SHOWING...");

		AddMovie m1 = new AddMovie(1,"Avengers:Endgame",2019,8.4,"Action, Adventure, Drama",181);
		m1.showMovie();

		AddMovie m2 = new AddMovie(2,"Joker",2019,8.5,"Crime, Drama, Thriller",122);
		m2.showMovie();

		AddMovie m3 = new AddMovie(3,"Kingsman:The Secret Service",2014,7.7,"Action, Adventure, Comedy",129);
		m3.showMovie();




		File dir = new File("YOUR PURCHASE SLIP");
		dir.mkdir();	//Directory (FOLDER) will be created

		File file1 = new File("YOUR PURCHASE SLIP/Slip.txt");

		try{
			file1.createNewFile();	//File Creation
			//System.out.println("Slip creating...");
		}catch(Exception e){
			System.out.println(e);
		}






		int count =1;
		do{
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("ENTER SERIAL NUMBER OF THE MOVIE YOU WANT TO WATCH: ");  
			int a= sc.nextInt(); 

			if(0<a && a<4){
			System.out.println("Movie Selected!");

				switch(a){
					case 1:System.out.println("You want to watch: "+m1.getName());
							try{
							Formatter formatter = new Formatter("YOUR PURCHASE SLIP/Slip.txt");
							formatter.format("#####-----GALAXY CINEPLEX-----#####\r\n");
							formatter.format("\r\n");
							formatter.format("Purchase summary...\r\n");
							formatter.format("\r\n");
							formatter.format("MOVIE: "+m1.getName()+"\r\n");
							formatter.format("\r\n");	//Writting in the text file...
					
							formatter.close();	//Have to close writting with close method...

							}catch(FileNotFoundException e){
								System.out.println(e);
							}
						ShowDate sd1 = new ShowDate();
						sd1.availableDate();

						ShowTime st1 = new ShowTime();
						st1.showTimeOne();

						Ticket t1 = new Ticket();
						t1.bookTicket();

						Payment p1 = new Payment();
						p1.makePayment();
					break;

					case 2:System.out.println("You want to watch: "+m2.getName());
							try{
							Formatter formatter = new Formatter("YOUR PURCHASE SLIP/Slip.txt");
							formatter.format("#####-----GALAXY CINEPLEX-----#####\r\n");
							formatter.format("\r\n");
							formatter.format("Purchase summary...\r\n");
							formatter.format("\r\n");
							formatter.format("MOVIE: "+m2.getName()+"\r\n");
							formatter.format("\r\n");	//Writting in the text file...
					
							formatter.close();	//Have to close writting with close method...

							}catch(FileNotFoundException e){
								System.out.println(e);
							}
						ShowDate sd2 = new ShowDate();
						sd2.availableDate();

						ShowTime st2 = new ShowTime();
						st2.showTimeTwo();

						Ticket t2 = new Ticket();
						t2.bookTicket();

						Payment p2 = new Payment();
						p2.makePayment();
					break;

					case 3:System.out.println("You want to watch: "+m3.getName());
							try{
							Formatter formatter = new Formatter("YOUR PURCHASE SLIP/Slip.txt");
							formatter.format("#####-----GALAXY CINEPLEX-----#####\r\n");
							formatter.format("\r\n");
							formatter.format("Purchase summary...\r\n");
							formatter.format("\r\n");
							formatter.format("MOVIE: "+m3.getName()+"\r\n");
							formatter.format("\r\n");	//Writting in the text file...
					
							formatter.close();	//Have to close writting with close method...

							}catch(FileNotFoundException e){
								System.out.println(e);
							}
						ShowDate sd3 = new ShowDate();
						sd3.availableDate();

						ShowTime st3 = new ShowTime();
						st3.showTimeThree();

						Ticket t3 = new Ticket();
						t3.bookTicket();

						Payment p3 = new Payment();
						p3.makePayment();
					break;

					default:System.out.println("Not in the list!");  
				}
			count =2; 
			}
			else{
			System.out.println("Your selection is not from the above list!.. Try again...");
			}
			

			} catch(Exception exp){
			System.out.println();
			System.out.println("Exception: "+exp);
			System.out.println("You must have to enter integer Number between 1 to 3!");  
			}
		}while(count==1);


		

		

	}
}