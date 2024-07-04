public class star_practice {
  public static void main(String[] args) {
    for(int i = 1; i <= 5; i++) {
    //1행부터 5행까지 행이 증가할수록 별이 증가하기 때문에 증가하는 반복문
	    for(int j = 0; j < i; j++) {
	      //i만큼 별을 반복출력
		    System.out.print("*");
	    }
	    System.out.println();//별찍고 줄바꿈
    }
  }
}
