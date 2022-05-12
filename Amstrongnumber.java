package week1.day3;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orgVal = 153;
		int val = orgVal;
		int temp=0;
		while(orgVal>0) {
			int a=orgVal%10;
		    temp =temp+(a*a*a);
		    orgVal=orgVal/10;
		}
		if(val==temp) {
			System.out.println("It is a Amstrong Number");
		}
		else {
			System.out.println("Not a Amstrong Number");
		}

	}

}
