package com.test;

import java.util.Collection;

public interface IParser {
     public static final String EXCEL_FORMAT = "XLS";
     public static final String EXCEL_FORMAT_2003 = "XLSX";
     public <T> Collection<T> read(String file, T className); 
     public <T> byte[] write(Collection<T> writeData);
}
