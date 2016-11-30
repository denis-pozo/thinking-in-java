package org.denispozo.tutorial.thj.type.information.reflection;

import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;
import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/*
 * Chapter - Type Information
 * Section - Reflection: runtime class information
 * Exercise 19
 */

public class ClassInfo {

	public static void main(String[] args) {
		if(args.length < 1) {
			printnr("Usage: name of class");
			System.exit(0);
		}
		Class<?> c = null;
		try {
			c = Class.forName(args[0]);
		} catch(ClassNotFoundException e) {
			printnr("No such class: " + e);
		}
		printnr("c: " + c);
		printnr("c.getAnnotations(): ");
		if(c.getAnnotations().length == 0) printnr("none");
		for(Annotation a : c.getAnnotations())
			printnr(a);
		printnr("c.getCanonicalName(): " + c.getCanonicalName());
		printnr("c.getClasses(): ");
		if(c.getClasses().length == 0) printnr("none");
		for(Class<?> cl : c.getClasses())
			printnr(cl);
		printnr("c.getClassLoader(): " + c.getClassLoader());
		printnr("c.getConstructors(): ");
		if(c.getConstructors().length == 0) printnr("none");
		for(Constructor<?> ctor : c.getConstructors())
			printnr(ctor);
		printnr("c.getDeclaredAnnotations(): ");
		if(c.getDeclaredAnnotations().length == 0) printnr("none");
		for(Annotation a : c.getDeclaredAnnotations())
			printnr(a);
		printnr("c.getDeclaredClasses(): ");
		if(c.getDeclaredClasses().length == 0) printnr("none");
		for(Class<?> cl : c.getDeclaredClasses())
			printnr(cl);
		printnr("c.getDeclaredConstructors(): ");
		if(c.getDeclaredConstructors().length == 0) printnr("none");
		for(Constructor<?> ctor : c.getDeclaredConstructors())
			printnr(ctor);
		printnr("c.getDeclaredFields(): ");
		if(c.getDeclaredFields().length == 0) printnr("none");
		for(Field f : c.getDeclaredFields())
			printnr(f);
		printnr("c.getDeclaredMethods(): ");
		if(c.getDeclaredMethods().length == 0) printnr("none");
		for(Method m : c.getDeclaredMethods())
			printnr(m);
		printnr("c.getDeclaringClass(): " + c.getDeclaringClass());
		printnr("c.getEnclosingConstructor(): " + c.getEnclosingConstructor());
		printnr("c.getEnclosingMethod(): " + c.getEnclosingMethod());
		printnr("c.getEnumConstants(): " + c.getEnumConstants());
		printnr("c.getDeclaredFields(): ");
		if(c.getFields().length == 0) printnr("none");
		for(Field f : c.getFields())
			printnr(f);
		printnr("c.getGenericInterfaces(): ");
		if(c.getGenericInterfaces().length == 0) printnr("none");
		for(Type t : c.getGenericInterfaces())
			printnr(t);
		printnr("c.getGenericSuperclass(): " + c.getGenericSuperclass());
		printnr("c.getInterfaces(): ");
		if(c.getInterfaces().length == 0) printnr("none");
		for(Class<?> i : c.getInterfaces())
			printnr(i);
		printnr("c.getMethods(): ");
		if(c.getMethods().length == 0) printnr("none");
		for(Method m : c.getMethods())
			printnr(m);
		printnr("c.getModifiers(): " + c.getModifiers());
		printnr("c.getName(): " + c.getName());
		printnr("c.getPackage(): " + c.getPackage());
		printnr("c.getProtectionDomain(): " + c.getProtectionDomain());
		print("c.getSigners(): ");
		if(c.getSigners() == null)
			printnr(c.getSigners());
		if(c.getSigners() != null) {
			printnr();
			if(c.getSigners().length == 0) printnr("none");
			if(c.getSigners().length > 0) {
				for(Object s : c.getSigners()) 
					printnr(s);
			}
		}
		printnr("c.getSimpleName(): " + c.getSimpleName());
		printnr("c.getSuperclass(): " + c.getSuperclass());
		printnr("c.getTypeParameters(): " + c.getTypeParameters());
		printnr("c.isAnnotation(): " + c.isAnnotation());
		printnr("c.isAnnotationPresent(Documented.class): " + c.isAnnotationPresent(Documented.class));
		printnr("c.isAnonymousClass(): " + c.isAnonymousClass());
		printnr("c.isArray(): " + c.isArray());
		printnr("c.isAssignableFrom(ClassInfo.class): " + c.isAssignableFrom(ClassInfo.class));
		printnr("c.isAssignableFrom(Object.class): " + c.isAssignableFrom(Object.class));
		printnr("c.isEnum(): " + c.isEnum());
		printnr("c.isInstance(Object.class): " + c.isInstance(Object.class));
		printnr("c.isInterface(): " + c.isInterface());
		printnr("c.isLocalClass(): " + c.isLocalClass());
		printnr("c.isMemberClass(): " + c.isMemberClass());
		printnr("c.isPrimitive(): " + c.isPrimitive());
		printnr("c.isSynthetic(): " + c.isSynthetic());		
	}
}
