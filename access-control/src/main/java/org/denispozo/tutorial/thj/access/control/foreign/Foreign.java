package org.denispozo.tutorial.thj.access.control.foreign;

public class Foreign {

	public static void main(String [] args) {
//		PackagedClass pc = new PackagedClass(); Comp. error!!
		
		/* When trying to create an object of the class PackagedClass, it fails because
		 * "PackageClass cannot be resolved to a type". It happens because PackagedClass is 
		 * defined with package access and Foreign is contained in a different one. Moving this
		 * class to package org.denispozo.tutorial.thj.access.control.local, this issue would
		 * be fixed.
		 */
	}
}
