package com.yzb808.main;

import java.net.URL;
import java.net.URLClassLoader;

public class MainClass {

	public static void main(String[] args) {
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);
		URL[] urls = ((URLClassLoader) systemClassLoader).getURLs();
		for (URL url : urls) {
			System.out.println(url);
		}
		
		ClassLoader userClassLoader = MainClass.class.getClassLoader();
		System.out.println("\n" + userClassLoader);
		System.out.println(userClassLoader.getResource("").getPath());
		urls = ((URLClassLoader) userClassLoader).getURLs();
		for (URL url : urls) {
			System.out.println(url);
		}
	}
}
