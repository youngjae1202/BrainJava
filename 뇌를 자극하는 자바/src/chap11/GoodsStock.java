package chap11;

public class GoodsStock {
	String goodsCode; //상품코드
	int stockNum; //재고 수량
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	@Override
	public String toString() {
		String str = "상품코드:" + goodsCode + "재고수량:" + stockNum;	
		return str;
	}
}
