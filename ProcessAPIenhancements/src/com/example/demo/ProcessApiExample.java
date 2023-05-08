package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessApiExample {
	public static void main(String[] args) throws IOException {
		// Run a simple command and print its output to the console
		Process process = new ProcessBuilder("cmd", "/c", "dir").start();
		String output = new BufferedReader(new InputStreamReader(process.getInputStream())).lines()
				.collect(Collectors.joining("\n"));
		System.out.println(output);

		// Run a more complex command and get its PID
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("cmd", "/c", "echo 'Hello, world!' | wc -c");
		Process process2 = processBuilder.start();
		long pid = process2.pid();
		System.out.println("PID of process: " + pid);

		// Check if a process is running
		ProcessHandle processHandle = ProcessHandle.of(pid).orElse(null);
		if (processHandle != null && processHandle.isAlive()) {
			System.out.println("Process is running");
		} else {
			System.out.println("Process is not running");
		}

		// Get a list of all processes on the system
		List<ProcessHandle> processes = ProcessHandle.allProcesses().collect(Collectors.toList());
		System.out.println("Number of processes: " + processes.size());
	}
}
