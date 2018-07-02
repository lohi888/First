

	import java.util.*;

	public class scrabe
	{
		public static void main(String[] args)
		{
			Date d1 = new Date();
			System.out.println("Current date is " + d1);
			Date d2 = new Date(2323223232L);
			System.out.println("Date represented is "+ d2 );
		}
	}
	/*
	{
		user=rs.getString(1);
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		
	if(user.equals("rakesh")){
		
		System.out.println(".....");
	pass=rs.getString(2);
	}		
	}
	
	if(pass.equals("123"))
	{
		JOptionPane.showMessageDialog(null,"account is not created please signUP");
	}
	else{
	if(password.equals(pass))
	{
		textuser.setText(null);
		textpassword.setText(null);
		Registration obj=new Registration();
		frame.dispose();
		obj.main(null);
	
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Invalide Login Details"+"please enter correct details");
	}
	}
	*/
	
	
	
	
	
	//second way 
	
	
	
	
	
	/*inal String queryCheck = "SELECT * from signup WHERE username like ?";
	final PreparedStatement ps = con.prepareStatement(queryCheck);
	ps.setString(1, username+'%');
	final ResultSet rs = ps.executeQuery();
	rs.next();
	
		System.out.println(rs.getString(2));
		String test=rs.getString(2);
		if(test.equals(password))
		{
			textuser.setText(null);
			textpassword.setText(null);
			Registration obj=new Registration();
			frame.dispose();
			obj.main(null);
		
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalide Login Details"+" please enter correct details");
		}*/
	
	
	
	
	
	
	
	
	
	///xl to program
/*	package com.pack;

	import java.io.FileInputStream;
	import java.io.IOException;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class ReadExcelFile {
		
		public void readExcel() throws BiffException, IOException {
			String FilePath = "D:\\sampledoc.xls";
			FileInputStream fs = new FileInputStream(FilePath);
			Workbook wb = Workbook.getWorkbook(fs);

			// TO get the access to the sheet
			Sheet sh = wb.getSheet("Sheet1");

			// To get the number of rows present in sheet
			int totalNoOfRows = sh.getRows();

			// To get the number of columns present in sheet
			int totalNoOfCols = sh.getColumns();

			for (int row = 0; row < totalNoOfRows; row++) {

				for (int col = 0; col < totalNoOfCols; col++) {
					System.out.print(sh.getCell(col, row).getContents() + "\t");
				}
				System.out.println();
			}
		}

		public static void main(String args[]) throws BiffException, IOException {
			ReadExcelFile DT = new ReadExcelFile();
			DT.readExcel();
		}
	}*/
	//checking purpose....
	
	//edited by karthi
	
	
	
	
