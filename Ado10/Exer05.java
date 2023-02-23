class SomarMultiplos {
  public static void main(String[] args) {
    int sum = somarMultiplos(4,5,15);
    System.out.println(sum);
  }

  public static int somarMultiplos(int numero, int inicio, int fim) {
    
    if (inicio == fim) {
      return 0;
    }

    if(inicio%numero == 0){
      
      return inicio + somarMultiplos(numero, inicio +1, fim);
      
    }else{
      
      return somarMultiplos(numero, inicio + 1, fim);
      
    }
  }
}
