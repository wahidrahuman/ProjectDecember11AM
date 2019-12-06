package com.kav.fileoperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CreateFile {
public static void main(String[] args) throws IOException {
	
	
	File f=new File("D:\\Kavin\\One Plus Backup\\samplefolder\\test\\k.txt");
	
boolean b=f.createNewFile();
boolean b1=f.isFile();
System.out.println(b);
System.out.println(b1);
//FileUtils.write(f,"File Operation");
FileUtils.write(f,"\t"+"topic",true);

}

}
