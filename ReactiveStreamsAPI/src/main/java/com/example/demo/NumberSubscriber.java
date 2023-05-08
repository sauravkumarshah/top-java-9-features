package com.example.demo;

import java.util.concurrent.Flow;

public class NumberSubscriber implements Flow.Subscriber<Integer> {
	private Flow.Subscription subscription;

	@Override
	public void onSubscribe(Flow.Subscription subscription) {
		System.out.println("Subscribed");
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(Integer item) {
		System.out.println("Received: " + item);
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
	}

	@Override
	public void onComplete() {
		System.out.println("Completed");
	}
}
