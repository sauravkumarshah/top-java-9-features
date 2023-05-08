package com.moduledemo.package2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ServiceLoader;

import com.moduledemo.IRepository.IHello;
import com.moduledemo.package1.Name;

public class HelloModule2 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		Name name = new Name();
		System.out.println("Hello " + name.getName());
		
		
		
		
		
		
		
		
		
		
		Iterable<IHello> services = ServiceLoader.load(IHello.class);
		IHello service = services.iterator().next();
		System.out.println(service.sayHelloToConsumer());

		
		
		
		
		
		
		
		
		
		
		
		Class<?> c = Class.forName("com.moduledemo.package1.privateMethod.PrivateMethod");
		Object newInstance = c.getDeclaredConstructor().newInstance();
		
		Method declaredMethod = c.getDeclaredMethod("getPrivateMethodData");
		declaredMethod.setAccessible(true);
		System.out.println(declaredMethod.invoke(newInstance));
	}
}
