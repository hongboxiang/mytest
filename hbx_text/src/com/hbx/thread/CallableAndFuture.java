package com.hbx.thread;

import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
        int xx = 1000;
		Future<Integer> future = threadPool.submit(new Callable<Integer>() {
			public Integer call() throws Exception {
				return new Random().nextInt(100);
			}
		});
        threadPool.shutdown();
		try {
			Thread.sleep(5000);// 可能做一些事情
			System.out.println(future.get());
			System.out.println(xx);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
