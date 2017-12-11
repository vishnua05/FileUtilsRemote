package com.test;

import java.util.Collection;

public class ExcelParser implements IParser {

	@Override
	public <T> Collection<T> read(String file, T className) {
		
		return null;
	}

	@Override
	public <T> byte[] write(Collection<T> writeData) {
		return null;
	}
	
}
