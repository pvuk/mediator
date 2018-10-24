package com.java.addition.postfixprefix;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostfixAndPrefixIncrement {
	public static void main(String[] args) {
		/*
		 * Addition example
		 */
		int i = 1;
		log.info("i value: {}", i);
		log.info("i++ value: {}", i++);//i++ will give the result of original i and store the new i for the next action
		log.info("i value: {}", i);
		log.info("++i value: {}", ++i);//++i will give the result of new i 
		log.info("i value: {}", i);
		
		/*
		 * Multiplication example
		 */
		int j = 1;
		log.info("j value: {}", j);
		log.info("j++ * 2 value: {}", j++ * 2);//j++ * 2 results 2 ( 1 * 2 )
		j = 1;//default to 1
		log.info("++j * 2 value: {}", ++j * 2);// ++j * 2 results 2 ( 2 * 2 )
	}
}
