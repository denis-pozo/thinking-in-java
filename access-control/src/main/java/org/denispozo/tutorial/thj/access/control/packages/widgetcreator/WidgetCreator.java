package org.denispozo.tutorial.thj.access.control.packages.widgetcreator;

import static org.denispozo.tutorial.thj.util.Print.*;

import org.denispozo.tutorial.thj.access.control.packages.Widget;

/*
 * Chapter - Access Control
 * Section - Java Access Specifiers
 * Exercise 7
 */

public class WidgetCreator {
	public static void main(String [] args) { 
		Widget widget = new Widget();
		print(widget.toString());
	}
}
