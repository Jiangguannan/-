package com.jgn.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() {
		try {
			String string = StreamUtil.readTextFile(new FileInputStream("C:\\Users\\姜冠南\\Desktop\\banana.txt"));
	
		System.out.println(string);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("C:\\Users\\姜冠南\\Desktop\\banana.txt"));
		System.out.println(string);
	}

}
