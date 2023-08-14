package com.souha.SaveTravel.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Travel")
public class Travel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 5, max = 200, message = "you need an expense name!!!!")
	private String expenseName;
	@NotNull
	@Size(min = 5, max = 200, message = "you need a vendor!!!!")
	private String vendor;
	@NotNull
	@Min(0)
	private Integer amount;
	@NotNull
	@Size(min = 5, max = 200, message = "you need a desciption!!!!")
	private String description;

	public Travel( String expenseName, String vendor, Integer amount, String description) {

		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	public Travel() {
	}
	// This will not allow the createdAt column to be updated after creation
//		    @Column(updatable=false)
//		    @DateTimeFormat(pattern="yyyy-MM-dd")
//		    private Date createdAt;
//		    @DateTimeFormat(pattern="yyyy-MM-dd")
//		    private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
