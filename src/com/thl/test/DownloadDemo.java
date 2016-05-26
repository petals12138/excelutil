package com.thl.test;

import java.util.ArrayList;
import org.apache.commons.lang3.RandomUtils;

import com.google.common.collect.Lists;
import com.thl.entity.Book;
import com.thl.utils.ExcelUtils;

/**
 * @Description: 导出测试类
 * @author taohanlin
 * @date 2016年5月26日 上午10:43:35
 */
public class DownloadDemo {
	public static void main(String[] args) {
		//导出
		String[] bookName={"语文书","数学书","英语书","化学书","地理书","生物书","物理书","政治书","历史书","散文书","高数书","微积分","计算机科学"};
		//数据
		ArrayList<Book> arr=Lists.newArrayList();
		for (int i=0 ; i<10 ; i++) {
			Book book=new Book(i, bookName[RandomUtils.nextInt(0, 13)], "类型", 50.0, "作者", "内容", "描述", "标题");
			arr.add(book);
		}
		//路径
		String url="D:/good";
		//文件名
		String fileName="book.xls";
		ExcelUtils.excelOut(arr, url, fileName);		
		System.out.println("导出完成~");
		
}
}
