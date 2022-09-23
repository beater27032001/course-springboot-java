package com.educandoweb.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Product;

@Embeddable
public class OrderItemPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order oder;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public Order getOder() {
		return oder;
	}

	public void setOder(Order oder) {
		this.oder = oder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(oder, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(oder, other.oder) && Objects.equals(product, other.product);
	}
}
