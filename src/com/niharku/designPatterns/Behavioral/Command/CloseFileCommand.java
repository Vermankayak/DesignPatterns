package com.niharku.designPatterns.Behavioral.Command;

public class CloseFileCommand implements ICommand {
	
	
	FileSystemReceiver fs;
	
	
	
	public CloseFileCommand(FileSystemReceiver fs) {
		this.fs = fs;
	}



	@Override
	public void execute() {
		this.fs.closeFile();
		
	}


}
