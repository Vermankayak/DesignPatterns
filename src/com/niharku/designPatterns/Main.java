package com.niharku.designPatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import com.niharku.designPatterns.Behavioral.TemplateMethod.GlassHouse;
import com.niharku.designPatterns.Behavioral.TemplateMethod.HouseTemplate;
import com.niharku.designPatterns.Behavioral.TemplateMethod.WoodenHouse;
import com.niharku.designPatterns.Creational.Builder.Computer;
import com.niharku.designPatterns.Creational.Prototype.Employee;
import com.niharku.designPatterns.Structural.Adapter.ISocketAdapter;
import com.niharku.designPatterns.Structural.Adapter.SocketAdapterImpl;
import com.niharku.designPatterns.Structural.Adapter.Volt;
import com.niharku.designPatterns.Structural.Bridge.IDrawingPen;
import com.niharku.designPatterns.Structural.Bridge.AbstractionShape;
import com.niharku.designPatterns.Structural.Bridge.Circle;
import com.niharku.designPatterns.Structural.Bridge.BlackDrawingPen;
import com.niharku.designPatterns.Structural.Bridge.BlueDrawingPen;
import com.niharku.designPatterns.Structural.Composite.Art;
import com.niharku.designPatterns.Structural.Composite.Square;
import com.niharku.designPatterns.Structural.Composite.Triangle;
import com.niharku.designPatterns.Structural.Decorator.BasicCar;
import com.niharku.designPatterns.Structural.Decorator.Car;
import com.niharku.designPatterns.Structural.Decorator.LuxuryCar;
import com.niharku.designPatterns.Structural.Decorator.SportsCar;
import com.niharku.designPatterns.Structural.Facade.HelperFacade;
import com.niharku.designPatterns.Structural.Proxy.CommandExecutorProxy;
import com.niharku.designPatterns.Behavioral.Mediator.*;
import com.niharku.designPatterns.Behavioral.ChainOfResponsibility.*;

//import com.niharku.designPatterns.Factory.Computer;
//import com.niharku.designPatterns.Factory.ComputerFactory;

public class Main {
	
	Integer amount;

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

 // <================================= Singleton ============================================>
//        Singleton s1Write = Singleton.getInstance();
//
//        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file1.ser"));
//
//        out.writeObject(s1Write);
//
//        out.close();
//
//        ObjectInput in = new ObjectInputStream(new FileInputStream("file1.ser"));
//
//        Singleton s1Read =  (Singleton) in.readObject();
//
//        in.close();
//
//        System.out.println(s1Write.hashCode());
//        System.out.println(s1Read.hashCode());
    	
 // <========================================================================================>   	

// <================================= Factory ============================================>
    	
//    	Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
//    	
//    	Computer server = ComputerFactory.getComputer("server", "2 GB", "500 GB", "2.4 GHz");
//    	
//    	System.out.println(pc.getClass());
//    	System.out.println(server.getClass());

   // <========================================================================================> 
    	
   // <================================= Builder ============================================>
    	
//    	Computer comp = new Computer.ComputerBuilder("512 GB", "16 GB").setIsRamRequired(true).setIsHddRequired(true).build();
//    	System.out.println(comp);
    	
   // <========================================================================================> 

   //<================================= Prototype ============================================>
//    	Employee e = new Employee();
//    	e.loadData();
//    	
//    	List<String>emp = e.getEmpList();
//    	
//    	Employee e1 = e.clone();
//    	List<String>emp1 = e1.getEmpList();
//    	
//    	emp1.add("Somali");
//    	emp1.add("Gay");
//    	
//    	System.out.println(emp);
//    	System.out.println(emp1);
   // <========================================================================================> 	
    	
   //<================================= Adapter ============================================>
    	
//    	SocketAdapterImpl sai = new SocketAdapterImpl();
    	
//    	Volt v1 = sai.get120Volts();
//    	Volt v2 = sai.get3Volts();
//    	Volt v3 = sai.get12Volts();
    	
//    	Volt v1 = getVolts(sai, 3);
//    	Volt v2 = getVolts(sai, 12);
//    	Volt v3 = getVolts(sai, 120);
    	



    
//    public static Volt getVolts(ISocketAdapter sc, Integer requiredVoltage){
//    	
//    	switch(requiredVoltage) {
//    	
//    	case 3:
//    		return sc.get3Volts();
//    	
//    	case 12:
//    		return sc.get12Volts();
//    	
//    	default:
//    		return sc.get120Volts();
//    	
//    	
//    	}
		
//	}
    	
    	 // <========================================================================================> 
    	
    	 // <================================== Composite ==============================================> 
    	
//    		Triangle triangle = new Triangle();
//    		Square sq = new Square();
//    		Art art = new Art();
//    		
//    		art.addShapes(triangle);
//    		art.addShapes(sq);
//    		
//    		art.draw("Red");
//    		
//    		art.removeShapes(triangle);
//    		
//    		art.clearShapes();
    		
    	
    	 // <========================================================================================> 
    	
    	 // <================================== Proxy ==============================================> 
//    		CommandExecutorProxy cep = new CommandExecutorProxy("nihar", "nihar@1234");
//    		cep.runCommand("rm -rf nihar.jpeg");
    	
    	// <========================================================================================> 
    	
    	// <================================== Facade ==============================================> 
    	
//    		HelperFacade hf = new HelperFacade();
//    		hf.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.PDF, "newTable");
    	
    	// <========================================================================================> 
    	
    	// <================================== Bridge ==============================================> 
    	
//    		IDrawingPen pen1 = new BlackDrawingPen();
//    		IDrawingPen pen2 = new BlueDrawingPen();
//    	
//    		AbstractionShape shape1 = new Circle(pen1, 12);
//    		AbstractionShape shape2 = new Circle(pen2, 20);
//    		
//    		shape1.drawShapes();
//    		shape2.drawShapes();
    	
    	// <========================================================================================> 
    	
    	// <================================== Decorator ==============================================> 
    	
//    		Car c = new SportsCar(new LuxuryCar(new BasicCar()));
//    		
//    		c.assemble();
    	
    	// <========================================================================================> 
    	
    	// <================================== Template Method ==============================================> 
    	
//    		HouseTemplate ht1 = new WoodenHouse();
//    		ht1.buildHouse();
//    		
//    		HouseTemplate ht2 = new GlassHouse();
//    		ht2.buildHouse();
    	// <========================================================================================>
    	
    	// <================================== Mediator ==============================================>
    	
//    			IChatMediator mediator = new ChatMediatorImpl();
//    			ColleagueAbstractClass user1 = new ColleagueImpl(mediator, "nihar");
//    			ColleagueAbstractClass user2 = new ColleagueImpl(mediator, "sushan");
//    			ColleagueAbstractClass user3 = new ColleagueImpl(mediator, "rashika");
//    			ColleagueAbstractClass user4 = new ColleagueImpl(mediator, "suneeta");
//    			
//    			mediator.addColleague(user1);
//    			mediator.addColleague(user2);
//    			mediator.addColleague(user3);
//    			mediator.addColleague(user4);
//    			
//    			user1.send("Hi How are you");
    	
    	// <========================================================================================>
    	
    	// <================================== Chain Of Responsibility ==============================================>
    	
    		IWithDrawChain c1 = new WithDraw50();
    		IWithDrawChain c2 = new WithDraw20();
    		IWithDrawChain c3 = new WithDraw10();
    		
    		c1.setNextChain(c2);
    		c2.setNextChain(c3);
    		
    		c1.withDrawAmount(120);
    	// <========================================================================================>
    }

    

}
