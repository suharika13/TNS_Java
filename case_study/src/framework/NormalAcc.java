package framework;

public class NormalAcc extends ShopAcc{
	
	public float deliveryCharge;
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}


	public void bookProduct(float charges)
	{
		
	}


	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + "]";
	}
	
}