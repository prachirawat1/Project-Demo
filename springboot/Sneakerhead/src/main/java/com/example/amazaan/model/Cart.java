package com.example.amazaan.model;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="cart")
public class Cart {
@Id
long id;
long product_id;
long user_id;
boolean orderPlaced;
public long getUser_id() {
	return user_id;
}
public void setUser_id(long user_id) {
	this.user_id = user_id;
}
public boolean isOrderPlaced() {
	return orderPlaced;
}
public void setOrderPlaced(boolean orderPlaced) {
	this.orderPlaced = orderPlaced;
}
int qty;
double price;
String added_date;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getProduct_id() {
	return product_id;
}
public void setProduct_id(long product_id) {
	this.product_id = product_id;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAdded_date() {
	return added_date;
}
public void setAdded_date(String added_date) {
	this.added_date = added_date;
}

}
