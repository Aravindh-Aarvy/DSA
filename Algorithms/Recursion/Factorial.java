 class Factorial {
  public static void main (String... args){
        int resutl = fact(3);
        System.out.print(resutl);
  }
  static int fact(int n){
      if(n!=1)
	    return n * fact(n-1);
	  return 1;
  }
}
