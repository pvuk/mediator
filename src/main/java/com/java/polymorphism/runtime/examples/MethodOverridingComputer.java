package com.java.polymorphism.runtime.examples;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 *
 */

@Slf4j
public class MethodOverridingComputer extends MethodOverridingDevice{
	
	@Override
	public long totalStandByTime(long standByTime) throws NullPointerException{
		
		return super.totalStandByTime(standByTime);
	}
	
	public static void main(String[] args) {
		MethodOverridingComputer moc = new MethodOverridingComputer();
		log.info("Total Standby Time: {}", moc.totalStandByTime(5));
	}
}
