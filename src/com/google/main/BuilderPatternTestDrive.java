package com.google.main;

import com.google.Computer;

public class BuilderPatternTestDrive {

	public static void main(String[] args) {

		Computer comp = new Computer.ComputerBuilder("500 GB", "8 GB", "i7")
										.setIsBluetoothEnabled(true)
										.setIsGraphicsCardEnabled(true)
										.build();
	}

}
