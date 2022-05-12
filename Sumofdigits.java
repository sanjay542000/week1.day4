package week1.day3;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input =1234;
        int temp=0;
        while(input>0) {
        	int a = input%10;
        	temp = temp+a;
        	input=input/10;
        }
        System.out.println(temp);
	}

}
