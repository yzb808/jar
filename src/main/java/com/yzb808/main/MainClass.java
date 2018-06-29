package com.yzb808.main;

import java.net.URL;
import java.net.URLClassLoader;

import org.apache.commons.lang.StringUtils;

public class MainClass {

	/*
	 * 获取当前应用的ClassPath资源
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("enter main");
		
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);
		URL[] urls = ((URLClassLoader) systemClassLoader).getURLs();
		for (URL url : urls) {
			System.out.println(url);
		}
		
		ClassLoader userClassLoader = StringUtils.class.getClassLoader();
		System.out.println("\n" + userClassLoader);
		System.out.println(userClassLoader.getResource("").getPath());
		urls = ((URLClassLoader) userClassLoader).getURLs();
		for (URL url : urls) {
			System.out.println(url);
		}
		
		System.out.println("dependency import:" + StringUtils.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	}
}
