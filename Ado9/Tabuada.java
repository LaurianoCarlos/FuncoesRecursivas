class Tabuada {
  public static void main(String[] args) {

    tabuada(10,0);
  }
  //funcoesRecursivas
  public static void tabuada(int num, int contador){
    
    if(contador > 10){
      return;
    }
    int multiplicar = num * contador;
    
    System.out.println(num+" x "+ contador+ "= "+ multiplicar);
    tabuada(num, contador + 1);

    
  }
}