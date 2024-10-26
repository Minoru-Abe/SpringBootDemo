package com.telusko.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer{
	
	public void compile() {
		System.out.println("Laptop Compiling...");
	}

}
