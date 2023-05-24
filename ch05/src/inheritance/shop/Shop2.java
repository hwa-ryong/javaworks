package inheritance.shop;

public class Shop2 extends HeadShop {

	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}

	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게: 5,000원");
	}
	
	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌게: 5,000원");
	}
	
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 4,000원");
	}
}
