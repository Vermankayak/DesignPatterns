package com.niharku.designPatterns.Structural.Proxy;

import java.io.IOException;

public class CommandExecutorImpl implements ICommandExecutor{

	@Override
	public void runCommand(String cmd) throws IOException {
		
		try {
			Runtime.getRuntime().exec(cmd);
			System.out.println(cmd + " :: Command executed");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
