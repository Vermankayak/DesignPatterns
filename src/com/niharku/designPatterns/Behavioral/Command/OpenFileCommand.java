package com.niharku.designPatterns.Behavioral.Command;

public class OpenFileCommand implements ICommand{

	FileSystemReceiver fs;
	
	
	
	public OpenFileCommand(FileSystemReceiver fs) {
		this.fs = fs;
	}



	@Override
	public void execute() {
		
		this.fs.openFile();
		
	}
	
	

}
