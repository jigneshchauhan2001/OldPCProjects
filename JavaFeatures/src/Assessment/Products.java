package Assessment;

 class Products implements Comparable<Products> {

	String productId;
	double price;

	Products() {
	}

	Products(String n, double a) {
		productId = n;
		price = a;
	}

	public int compareTo(Products product) {
		if (this.price == product.price)
			return 0;
		else if (this.price > product.price)
			return 1;
		else
			return -1;
	}

	
}
