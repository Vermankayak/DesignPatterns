package com.niharku.designPatterns.Structural.Adapter;

public class SocketAdapterImpl implements ISocketAdapter {

	Socket socket = new Socket();
	
	@Override
	public Volt get120Volts() {
		return socket.getVolt();
	}

	@Override
	public Volt get3Volts() {
		Volt v = socket.getVolt();
		return convert(v, 40);
	}

	@Override
	public Volt get12Volts() {
		Volt v = socket.getVolt();
		return convert(v, 10);
	}
	
	public Volt convert(Volt v, Integer i) {
		return new Volt(v.getVolt()/i);
	}
	
	

}
