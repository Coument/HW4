package hw_ch4;

public class hw_ch4{
	public static void main(String[] args) {
		/*RacingCar rccar1;
		rccar1 = new RacingCar();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);*/
		
		/*rccar1.show();*/
		
		/*Car car1;
		car1 = new RacingCar();
		car1.setCar(1234, 20.5);
		car1.show();*/
		
		/*Car cars[];
		cars = new Car[2];
		cars[0]= new Car();
		cars[0].setCar(1234, 20.5);
		cars[1]= new RacingCar();
		cars[1].setCar(4567, 30.5);
		for(int i=0;i<cars.length; i++)
			{
			cars[i].show();
			}*/
		
		/*Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		System.out.println(car1);*/
		
		/*Car car1 = new Car();
		Car car2 = new Car();
		Car car3;
		car3 = car1;
		System.out.println("car1=car2"+car1.equals(car2));
		System.out.println("car1=car3" +car1.equals(car3));*/
		
		/*Car[] cars;
		cars = new Car[2];
		cars[0]= new Car();
		cars[1] = new RacingCar();
		for(int i=0;i<cars.length; i++)
		{
			Class cl= cars[i].getClass();
			System.out.println("第"+(i+1)+"個類別是"+cl);
		}*/
		
		/*Vehicle[] vc = new Vehicle[2];
		vc[0] = new Car(1234, 20.5); vc[0].setSpeed(60);
		vc[1] = new Plane(232); vc[1].setSpeed(500);
		for (int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}*/
		
		/*Vehicle[] vc;
		vc = new Vehicle[2];
		vc[0] = new Car(1234, 20.5);
		vc[1] = new Plane(232);
		for (int i = 0; i < vc.length; i++)
		{
			if (vc[i] instanceof Car)
				System.out.println("第"+(i+1)+"個物件是Car");
			else
				System.out.println("第"+(i+1)+"個物件不是Car");
		}*/
		
		/*iVehicle[] ivc;
		ivc = new iVehicle[2];
		ivc[0] = new Car(1234, 20.5);
		ivc[1] = new Plane(232);
		for(int i=0; i<ivc.length; i++)
		{
		ivc[i].show();
		}*/
		Car car1=new Car(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface iVehicle{
	void vShow();
}

interface iMaterial{
	void mShow();
}

class Car implements iVehicle,iMaterial
{
	private int num;
	private double gas;
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void vShow()
	{
	System.out.println("num=" + num);
	System.out.println("gas=" + gas);
	}
	public void mShow()
	{
	System.out.println("鐵");
	}
}

/*interface iVehicle{
	int weight=1000;
	void show();
}

class Car implements iVehicle{
	private int num;
	private double gas;
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show()
	{
	System.out.println("num=" + num);
	System.out.println("gas=" + gas);
	}
}
class Plane implements iVehicle{
	private int flight;
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("flight="+flight);
	}

}*/

/*abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("speed="+speed);
	}
	abstract void show();
}

class Car extends Vehicle
{
	private int num;
	private double gas;
	public Car (int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");

	}
	public void show()
	{
		System.out.println("num="+num);
		System.out.println("gas="+gas);
		System.out.println("speed="+speed);
	}
}
class Plane extends Vehicle
{
	private int flight;
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show(){
		System.out.println("flight="+flight);
		System.out.println("speed="+speed);
	}
}*/



/*class Car{
	protected int num;
	protected double gas;
	public Car()
	{
	num = 0;
	gas = 0.0;
	System.out.println("生產了車子");}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println(num+","+g);
	}
	
	public void show()
	{
	System.out.println("車號" + num);
	System.out.println("油量" + gas);}
	
	public String toString() {
		String str = "車號:"+num+";油量:"+gas;
		return str;
	}
}*/

/*class RacingCar extends Car
{
	private int course;
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) {
	course = c;
	System.out.println(course);}
	public void newShow() {
		System.out.println(num);
		System.out.println(gas);
		System.out.println(course);}
	public void show() {
		System.out.println(num);
		System.out.println(gas);
		System.out.println(course);}
}*/