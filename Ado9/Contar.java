class Contar {
  public static void main(String[] args) {

    contar(5,10);

  }
  //funcoesRecursivas
  public static void contar(int inicio, int fim){
    
  if(inicio > fim){
    return;
  }
    System.out.println(inicio);
    contar(inicio + 1, fim);
  }
}