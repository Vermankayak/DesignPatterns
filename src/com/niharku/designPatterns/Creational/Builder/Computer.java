package com.niharku.designPatterns.Creational.Builder;

public class Computer {
	
	private String hdd;
	private String ram;
	private boolean isRamRequired;
	private boolean isHddRequired;
	
	public String getHdd() {
		return hdd;
	}
	
	public String getRam() {
		return ram;
	}
	
	public boolean getIsRamRequired() {
		return isRamRequired;
	}
	
	public boolean getIsHddRequired() {
		return isHddRequired;
	}
	
	
	
	private Computer(ComputerBuilder builder) {
		
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isHddRequired = builder.isHddRequired;
		this.isRamRequired = builder.isRamRequired;
		
	}
	
	public static class ComputerBuilder{
		
		private String hdd;
		private String ram;
		private boolean isRamRequired;
		private boolean isHddRequired;
		
		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}
		
		public ComputerBuilder setIsRamRequired(boolean isRamRequired) {
			this.isRamRequired = isRamRequired;
			return this;
		}
		
		public ComputerBuilder setIsHddRequired(boolean isHddRequired) {
			this.isHddRequired = isHddRequired;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
		
		
	}
	
	@Override
	public String toString() {
		return hdd + ram + isHddRequired + isRamRequired;
	}
	

}
