package com.telusko.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
	
	public void compile() {
		System.out.println("Laptop Compiling...");
	}

}