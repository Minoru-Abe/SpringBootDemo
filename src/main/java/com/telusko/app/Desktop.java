package com.telusko.app;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	
	public void compile() {
		System.out.println("Desktop compiling...");
	}

}
