package chap11;

public class GoodsStock {
	String goodsCode; //��ǰ�ڵ�
	int stockNum; //��� ����
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	@Override
	public String toString() {
		String str = "��ǰ�ڵ�:" + goodsCode + "������:" + stockNum;	
		return str;
	}
}
