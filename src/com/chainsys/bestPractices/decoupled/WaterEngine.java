package com.chainsys.bestPractices.decoupled;

public class WaterEngine implements Iengine{
	@Override
	public void start() {
		System.out.println("Water Engine Started");
	}
	@Override
	public void stop() {
		System.out.println("Water Engine Stopped");
	}
}
