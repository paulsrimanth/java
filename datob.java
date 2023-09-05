class Dob{
 public static void main(String [] args){
 int years = 20;
 int tmo=10;
 int tday =16;
int days =(years*365)+(tmo*30)+tday; 
int months = days/30;
int hours = days*24;
int minutes=hours*60;

System.out.println("years "+years);
System.out.println("months "+months);
System.out.println("hours "+hours);
System.out.println("minutes "+minutes);
}
}