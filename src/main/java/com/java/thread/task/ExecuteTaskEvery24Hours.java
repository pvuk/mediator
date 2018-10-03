package com.java.thread.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExecuteTaskEvery24Hours {
	
	private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++){
			list.add("File Name: "+ i);
		}
		final Runnable backup = new Runnable() {
			
			@Override
			public void run() {
				list.forEach(System.out::println);
				log.info("---------------------");
			}
			
		};
		
		final ScheduledFuture<?> backupHandle = scheduler.scheduleAtFixedRate(backup, 2, 2, TimeUnit.SECONDS);
		
		//schedule will be cancel in 5secs
		scheduler.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("BackupHandle is cancel");
				backupHandle.cancel(true);
				
			}
		}, 5, TimeUnit.SECONDS);
	}
}
