class Pares {
  public static void main(String[] args) {

    exibirPares(0,10);
  }
  //funcoesRecursivas
  public static void exibirPares(int inicio, int fim ){
    
    if(inicio > fim){
      return;
    }
    
     if(inicio%2==0){
       System.out.println(inicio);
     }
    
    
    
    exibirPares(inicio + 1, fim);

    
  }
}