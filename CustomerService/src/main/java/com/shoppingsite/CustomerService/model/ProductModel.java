package com.shoppingsite.CustomerService.model;

public class ProductModel {
	
	//private static final long serialVersionUID = 3522337990064327267L;
	private Long id;
    private String name;
    private String description;
    private String productModel;
    private double price;
    
    public ProductModel() {
        
    }
    
    public ProductModel(Long id, String name, String description, String productModel, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.productModel = productModel;
		this.price = price;
	}
    
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
	
