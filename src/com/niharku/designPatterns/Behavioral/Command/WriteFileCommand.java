package com.niharku.designPatterns.Behavioral.Command;

public class WriteFileCommand implements ICommand {
	
	FileSystemReceiver fs;
	
	
	
	public WriteFileCommand(FileSystemReceiver fs) {
		this.fs = fs;
	}



	@Override
	public void execute() {
		this.fs.writeFile();
		
	}


}
