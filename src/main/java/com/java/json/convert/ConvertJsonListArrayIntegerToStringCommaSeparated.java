package com.java.json.convert;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonListArrayIntegerToStringCommaSeparated {
	
	public static void main(String[] args) {
		try {
			@SuppressWarnings("rawtypes")
			List list = new ObjectMapper().readValue("[404, 405]", List.class);
			String array = list.toString().replaceAll("\\[|\\]", "");
			System.out.println(array);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
