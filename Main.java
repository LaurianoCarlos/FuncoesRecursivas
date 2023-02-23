class Main {
  public static void main(String[] args) {
   int fatorial = contar(5);
    System.out.println(fatorial);
  }

  public static int contar(int num) {
    
    if(num == 1) {
      return num;
    }
    
   return num * contar(num - 1);
  }
}