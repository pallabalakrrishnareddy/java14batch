package com.hcl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="laptop_info")
@NamedQuery(name="Laptop.getAllRecords",query="From Laptop Where name=?1")
public class Laptop {
	@Id
	//@GeneratedValue
private long id;
	//@Column(name="Brand_name")
private String name;
	//@Column(name="laptop_price")
private double price;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(long id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
}
	

}
