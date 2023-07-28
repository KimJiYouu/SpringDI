package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("battery-context.xml");
		Car c = ctx.getBean(Car.class);
		c.getBattery().energy();
		
		Airplane a = ctx.getBean(Airplane.class);
		a.getBattery().energy();
	}

}
