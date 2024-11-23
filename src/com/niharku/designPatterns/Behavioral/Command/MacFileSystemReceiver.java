package com.niharku.designPatterns.Behavioral.Command;

public class MacFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("opeining file in mac os");
		
	}

	@Override
	public void closeFile() {
		System.out.println("closing file in mac os");
		
	}

	@Override
	public void writeFile() {
		System.out.println("writing to file in mac os");
		
	}

}
