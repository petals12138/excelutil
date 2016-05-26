package com.thl.test;

import java.util.ArrayList;

import com.thl.entity.Book;
import com.thl.utils.ExcelUtils;

/**
 * @Description: 导入测试类
 * @author taohanlin
 * @date 2016年5月26日 上午11:13:56
 */
public class ImportDemo {
	public static void main(String[] args) {
		ArrayList<Book> excelIn = ExcelUtils.excelIn(Book.class, "D:/good/book.xls");
		for (Book book : excelIn) {
			System.out.println(book);
		}
	}
	

}
