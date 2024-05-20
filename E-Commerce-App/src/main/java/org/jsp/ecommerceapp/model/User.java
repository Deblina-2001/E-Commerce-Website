package org.jsp.ecommerceapp.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false,unique=true)
	private long phone;
	@Column(nullable=false,unique=true)
	private String email;
	@Column(nullable=false)
	private int age;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String password;
	private String status;
	private String token;
	@OneToMany(mappedBy = "user")
	private List<Address> addresss;
	@JoinTable(name="user_cart",joinColumns = {@JoinColumn(name="user_id")},inverseJoinColumns = {@JoinColumn(name="product_id")})
	@OneToMany
	private List<Product>cart;
	@JoinTable(name="user_wishList",joinColumns = {@JoinColumn(name="user_id")},inverseJoinColumns = {@JoinColumn(name="product_id")})
	@OneToMany
	private List<Product>wishList;
	@OneToMany(mappedBy="user")
	private List<UserOrder>orders;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<Address> getAddresss() {
		return addresss;
	}
	public void setAddresss(List<Address> addresss) {
		this.addresss = addresss;
	}
	public List<Product> getCart() {
		return cart;
	}
	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
	public List<Product> getWishList() {
		return wishList;
	}
	public void setWishList(List<Product> wishList) {
		this.wishList = wishList;
	}
	public List<UserOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<UserOrder> orders) {
		this.orders = orders;
	}
	
}
