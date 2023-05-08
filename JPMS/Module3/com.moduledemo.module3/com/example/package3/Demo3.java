package com.example.package3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> c = Class.forName("com.moduledemo.package1.privateMethod.PrivateMethod");
		Object newInstance = c.getDeclaredConstructor().newInstance();
		
		Method declaredMethod = c.getDeclaredMethod("getPrivateMethodData");
		declaredMethod.setAccessible(true);
		System.out.println(declaredMethod.invoke(newInstance));

	}

}
