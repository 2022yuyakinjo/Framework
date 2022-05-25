package Entity;

public class Spring {
    private Integer product_id;
    private String product_name;
    private String price;

    public Spring() {

    }

    public Spring(Integer product_id, String product_name, String price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }
    public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

    public String getUserInfo() {
        return  "product_id=" + product_id + ", product_name=" + product_name + ", price=" + price;
    }

}
