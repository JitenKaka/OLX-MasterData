package com.olx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class CategoryEntity {

	@Id
	@GeneratedValue
	private int id;
	private String category;
	private String description;
	private String name;
	public CategoryEntity(int id, String category, String description, String name) {
		super();
		this.id = id;
		this.category = category;
		this.description = description;
		this.name = name;
	}
	public CategoryEntity(String category, String description, String name) {
		super();
		this.category = category;
		this.description = description;
		this.name = name;
	}
	public CategoryEntity() {
		
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
		return "CategoryEntity [id=" + id + ", category=" + category + ", description=" + description + ", name=" + name
				+ "]";
	}
	
	
	

}
