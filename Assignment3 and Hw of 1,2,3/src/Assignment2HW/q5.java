package Assignment2HW;

public class q5 {

	public static void main(String[] args) {
		
	}

}

class RestaurantMeal{
	String name;double price;
	
	RestaurantMeal(String a , double b)
	{name = a;price = b;}
	
}

class HotelService extends RestaurantMeal{
	int roomno;double servfee;String nameServ;
	
	HotelService(String a,int b,double c,String d, double e)
	{super(d,e);
	roomno=b;servfee=c;nameServ=a;}
	
}


class RoomServiceMeal extends HotelService{
	String roomservice;

	RoomServiceMeal(String c,String a,int b,String d, double e)
	{super(a,b,24,d,e);//the super constructor must be called first hen anything else
	roomservice = c;}
	
}