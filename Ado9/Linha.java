class Linha {
  public static void main(String[] args) {

    linha(5);
  }
  //funcoesRecursivas
  public static void linha(int num){

    if(num == 0){
      return;
    }
    System.out.print("*");

    linha(num - 1);
  }
}