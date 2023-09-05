class main
{
	public static void main(String[] args) {
		String Name = "Book my show";
		String Locations = "Hyderabad/Bangalore/Vijayawada",Location = "Hyderabad";
		String Events = "Movies/Stream/Plays/Sports",Event = "Movies";
		String Movies = "Blue beetle,Jailer,Bhola Shankar,Oppenheimer",Movie= "Oppenheimer";
		String Dates = "19 - 25 August", Date = "20 August";
		String Theatres = " Prasads,PVR,AMB,INOX,AAA",Theatre = "Prasads";
		int seats = 3;
		int ticketprice=150;
		int charges = 25;
		int totalprice = (seats*ticketprice)+(seats*charges);
		String payments = "UPI/Credit Card/Debit Card",payment = "UPI";
		System.out.println(Name);
		System.out.println("Select Location :"+ Locations);
		System.out.println("Location selected : "+ Location);
		System.out.println("Select Event : "+ Events);
		System.out.println("Selected Event : "+Event);
		System.out.println("Movies showing now in "+Location+ " are : " + Movies);
		System.out.println("Selected Movie : "+ Movie);
		System.out.println("Select a date between "+ Dates );
		System.out.println("Selected date : "+ Date);
		System.out.println("Theatres showing "+ Movie +" are :"+ Theatres);
		System.out.println("Selected Theatre : "+ Theatre);
		System.out.println("No. of seats required : "+ seats);
		System.out.println("Choose the seats");
		System.out.println("Pay " +totalprice+ " Rupees");
		System.out.println("Select mode of payment : "+ payments);
		System.out.println("Selected mode of payment : "+ payment);
		System.out.println("Payment successful");
		System.out.println("Your booking CONFIRMED! Scan the QR Code at the Theatre");
	}
}