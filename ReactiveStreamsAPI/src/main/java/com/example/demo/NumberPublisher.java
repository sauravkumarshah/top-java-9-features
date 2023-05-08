package com.example.demo;

import java.util.concurrent.SubmissionPublisher;

public class NumberPublisher {
	public static void main(String[] args) throws InterruptedException {
		SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

		publisher.subscribe(new NumberSubscriber());

		for (int i = 1; i <= 5; i++) {
			publisher.submit(i);
		}

		publisher.close();

		Thread.sleep(1000); // Wait for the subscriber to finish processing
	}
}
