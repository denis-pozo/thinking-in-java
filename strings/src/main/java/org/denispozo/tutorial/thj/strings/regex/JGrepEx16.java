package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Strings
 * Section - Regular Expressions and Java I/O
 * Exercise 16
 */


public class JGrepEx16 {
	public static void main(String [] args){
		
		if(args.length < 2) { 
			print("Usage: java JGrepEx16 [file or directory] regex flag");
			System.exit(0);
		}
		
		Pattern p = Pattern.compile(args[1]);
		// Check whether it is a file
		Matcher d = Pattern.compile("\\w+\\.{1}\\w+").matcher(args[0]);
		if(d.find()) {
			print("File: " + args[0]);
			// Iterate through the lines of the input file:
			int index = 0;
			Matcher m = p.matcher(""); // creates empty Matcher object
			for(String line : new TextFile(args[0])){
				m.reset(line);
				while(m.find()){
					print(index++ + ": " +
							m.group() + ": " + m.start());
				}
			}
			
		}
		// for '.' (current) directory
		Matcher e = Pattern.compile("ˆ\\.{1}$").matcher(args[0]);
		if(e.find()) {
			File[] files = new File(args[0]).listFiles();
			System.out.println("root dir of files: " + Arrays.asList(files));
			// Iterate through the lines of each file in directory:
			for(File f : files) {
				if(f.getName().matches("\\w+\\.{1}\\w+")) {
					System.out.println(f.getName() + ":");
					int index = 0;
					Matcher m = p.matcher(""); // creates empty Matcher object
					for(String line : new TextFile(f.getName())) {
						m.reset(line);
						while(m.find())
							System.out.println(index++ + ": " + 
								m.group() + ": " + m.start());
					}
				}
				System.out.println();
			}
		}
		
		d.reset();
		e.reset();
		if(!(d.find() || e.find())) {
			if(new File(args[0]).listFiles() == null) { 
				System.out.println("no such directory: " + args[0]);
				System.exit(0); 
			}
			File[] files = new File(args[0]).listFiles();
			System.out.println(args[0] + ": subdir of files: " + Arrays.asList(files));
			// Iterate through the lines of each file in directory:
			for(File f : files) {
				int index = 0;
				Matcher m = p.matcher(""); // creates emtpy Matcher object
				for(String line : new TextFile(args[0] + "\\" + f.getName())) {
					m.reset(line);
					while(m.find())
						System.out.println(index++ + ": " + 
							m.group() + ": " + m.start());
				}
				System.out.println();
			}
		}
	}
}

