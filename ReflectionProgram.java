package com.monocept.test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionProgram {
		    public static void main(String[] args) {
		    	try {
		            Class c = Class.forName(args[0]);
		            System.out.println("Attributes/Fields:");
		            Field[] fields = c.getDeclaredFields();
		            for (Field field : fields) {
		                System.out.println("  " + field.getType().getName() + " " + field.getName());
		            }
		            System.out.println("Methods:");
		            Method[] methods = c.getDeclaredMethods();
		            for (Method method : methods) {
		                System.out.println("  " + method.getReturnType().getName() + " " + method.getName() + "(" + Arrays.toString(method.getParameterTypes()) + ")");
		            }
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        }
}

}
