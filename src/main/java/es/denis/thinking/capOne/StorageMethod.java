package es.denis.thinking.capOne;

public class StorageMethod {

	int storage(String s){
		return s.length();
	}
	
	public static void main(String[] args) {
		StorageMethod storageMethod = new StorageMethod();
		System.out.println("Exercice 6: Calling storage method");
		String s = "The length of this string is: ";
		System.out.println(s + storageMethod.storage(s));

	}

}
