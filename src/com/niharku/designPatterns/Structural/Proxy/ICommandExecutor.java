package com.niharku.designPatterns.Structural.Proxy;

import java.io.IOException;

public interface ICommandExecutor {
	void runCommand(String cmd) throws IOException;
}
