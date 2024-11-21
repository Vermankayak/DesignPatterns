package com.niharku.designPatterns.Structural.Proxy;

import java.io.IOException;

public class CommandExecutorProxy implements ICommandExecutor {
	
	ICommandExecutor ce;
	boolean isAdmin;
	
	
	public CommandExecutorProxy(String username, String pwd) {
		if("nihar".equals(username) && "nihar@123".equals(pwd))
			isAdmin = true;
		
		this.ce = new CommandExecutorImpl();
	}


	@Override
	public void runCommand(String cmd) throws IOException {
		
		if(isAdmin) {
			this.ce.runCommand(cmd);
		}else if(cmd.contains("rm")){
			System.out.println("Not allowed to use rm command");
		}else {
			this.ce.runCommand(cmd);
		}
		
	}
	

}
