package oopIntro;

public class Main {

	public static void main(String[] args) {
	
	Product product1=new Product(1,"monster",12000,"16 gb RAM");//örnek oluþturma , referans oluþturma, intance , Product() bu constructor bloðudur. Productta burada iþlem yapýlabilir.
//	product1.detail="16 gb RAM";
//	product1.id=1;
//	product1.name="lenovo";
//	product1.unitPrice=15000;  
	
	Product product2=new Product();
	product2.detail="16 gb RAM";
	product2.id=2;
	product2.name="lenovo";
	product2.unitPrice=15000;
	
	Product product3=new Product();
	product3.detail="16 gb RAM";
	product3.id=3;
	product3.name="hp";
	product3.unitPrice=15000;
	
	Product[] products= {product1,product2,product3};
	System.out.println(products.length);
	

	for (Product product : products) {
		
		System.out.println(product.unitPrice);
	}
	
	
	Category category1=new Category();
	category1.id=1;
	category1.name="bilgisayar";
	
	Category category2=new Category();
	category2.id=2;
	category2.name="tablet";
	
	Category[] categorys= {category1,category2};
	for (Category category : categorys) {
		System.out.println(category.name);
		
	}
	
	ProductManager productManager = new ProductManager();// ProductManager class ý içinde sepete ekle methodu çaðýrýldý.
	productManager.addToCart(product1);//method çalýþýrken bir dataya ihtiyaç duyuyorsa () içine parametreyi koyarak gönderebiliriz. 
	productManager.addToCart(product2); 
	productManager.addToCart(product3);

	
	
	}

}
