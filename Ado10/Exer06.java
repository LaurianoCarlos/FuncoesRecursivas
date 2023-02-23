class Exer06 {
  public static void main(String[] args) {
    int sum = potencia(5,0);
    System.out.println(sum);
  }

  public static int potencia(int numero, int expoente) {
    
    if (expoente < 1) {
      return 1;
    }

    return numero * potencia(numero, expoente -1);
  }
}
