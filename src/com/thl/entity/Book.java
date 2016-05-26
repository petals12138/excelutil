package com.thl.entity;

/**
 * @Description: book书籍封装类
 * @author taohanlin
 * @date 2016年5月26日 上午10:49:39
 */
public class Book {
	private int id;
	
	private String name;
	
	private String type;
	
	private  double price;
	
	private String author;
	
	private String content;
	
	private String description;
	
	private String title;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public Book(int id, String name, String type, double price, String author, String content, String description,
			String title) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.author = author;
		this.content = content;
		this.description = description;
		this.title = title;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", author=" + author
				+ ", content=" + content + ", description=" + description + ", title=" + title + "]";
	}
	
	
}
