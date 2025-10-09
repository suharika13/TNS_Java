package application;
import framework.NormalAcc;
public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Hy NormalAcc user! your product charges are :" +charges +"And the deliverycharges are :"+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + "]";
	}	
}