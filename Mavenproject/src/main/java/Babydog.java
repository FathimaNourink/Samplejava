
public class Babydog extends Dog 
{
int soundlimit= 5;

public  void sound()
{
	System.out.println("The sound of babydog is");
	System.out.println("Sound limit is:"+ soundlimit);
}
public static void main (String []args )
{
	Babydog d=new Babydog();
	d.run();
	d.distancerun();
	d.sound();
	System.out.println(d.speed);
	System.out.println(d.distance);
	
}
}
