package org.denispozo.tutorial.thj.type.information.cog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import org.denispozo.tutorial.thj.util.Null;

/*
 * Chapter - Type Information
 * Section - The Null Object
 * Example
 */

public class NullRobot {

	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot) Proxy.newProxyInstance(
					NullRobot.class.getClassLoader(), 
					new Class [] { Null.class, Robot.class },
					new NullRobotProxyHandler (type));
	}
	
	public static void main(String[] args) {
		Robot [] bots = { 
				new SnowRemovalRobot("SnowBee"),
				newNullRobot(SnowRemovalRobot.class)
		};
		
		for(Robot bot : bots){
			Robot.Test.test(bot);
		}
	}
}

class NullRobotProxyHandler implements InvocationHandler {
	
	private String nullName;
	private Robot proxied = new NullRobot();
	NullRobotProxyHandler(Class<? extends Robot> type) {
		nullName = type.getSimpleName() + " NullRobot";
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxied, args);
	}
	
	private class NullRobot implements Null, Robot {
		
		public String name() { 
			return nullName; 
		}
		
		public String model() {
			return nullName;
		}
		
		@Override
		public List<Operation> operations() {
			return Collections.emptyList();
		}
	}
}