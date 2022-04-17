package com.vit.exceptions;

import java.nio.file.FileAlreadyExistsException;

public class ThrowSvsThrow {

	public static void main(String[] args) throws CustomisedException, InterruptedException {
		System.out.println("Test Main");
		//throw new FileAlreadyExistsException("File exits");
		try {
		throw new CustomisedException("My Exception");
			
		}catch(Exception e ) {
			test();
		}
		
	}

	public static void test() throws InterruptedException {
		Thread.sleep(1000);
	}
}
