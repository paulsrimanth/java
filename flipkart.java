public class Main
{
	public static void main(String[] args) {
		System.out.println("APPLE iPhone 14");
		int price = 79900,packfee=99;
		double off = price/100.0*14;
		double offerprice = price - off;
		double bankoffer = offerprice/100.0*5;
		double priceafterbankoffer = offerprice-bankoffer;
		int exchange = 7000;
		double finalprice = priceafterbankoffer-exchange+packfee;
		double supercoins= finalprice/100;
		supercoins = supercoins*2;
		System.out.println("Original price is "+ price);
		System.out.println("offer price is "+ offerprice);
		System.out.println("bank offer is"+ bankoffer);
		System.out.println("price after bank offer is "+ priceafterbankoffer);
		System.out.println("exchange offer "+ exchange);
		System.out.println("final price is "+ finalprice);
		System.out.println("Supercoins "+ supercoins);
	}
}