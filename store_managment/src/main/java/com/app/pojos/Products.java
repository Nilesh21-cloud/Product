package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int P_Id;
	private String productName;
	private String categories;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "shop_id",nullable = false)
	private Shop shop;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int p_Id, String productName, String categories) {
		super();
		P_Id = p_Id;
		this.productName = productName;
		this.categories = categories;
	}

	public int getP_Id() {
		return P_Id;
	}

	public void setP_Id(int p_Id) {
		P_Id = p_Id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return String.format("Products [P_Id=%s, productName=%s, categories=%s]", P_Id, productName, categories);
	}
	
	
	
	
}
