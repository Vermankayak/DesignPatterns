package com.niharku.designPatterns.Behavioral.Command;

public class FileSystemRecevierUtil {
	
	public static FileSystemReceiver getFileSystemReceiver(){
		
		if(System.getProperty("os.name").contains("Mac")) {
			return new MacFileSystemReceiver();
		}else {
			return new UnixFileSystemReceiver();
		}
		
	}

}
