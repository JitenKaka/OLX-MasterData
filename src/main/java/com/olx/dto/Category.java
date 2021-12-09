package com.olx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Category Model")
public class Category {

	@ApiModelProperty("Unique identifier of the Category")
	private int id;
	@ApiModelProperty("Category represents particular item name")
	private String category;
	private String description;
	private String name;
	public Category(int id, String category, String description, String name) {
		super();
		this.id = id;
		this.category = category;
		this.description = description;
		this.name = name;
	}
	public Category(String category, String description, String name) {
		super();
		this.category = category;
		this.description = description;
		this.name = name;
	}
	public Category() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category + ", description=" + description + ", name=" + name
				+ "]";
	}
	

	
	
}
