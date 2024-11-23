package com.niharku.designPatterns.Behavioral.Command;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("opening file in unix os");
		
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in unix os");
		
	}

	@Override
	public void writeFile() {
		System.out.println("writing to file in unix os");
		
	}

}
