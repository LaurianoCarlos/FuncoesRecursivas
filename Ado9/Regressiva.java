class Regressiva {
  public static void main(String[] args) {

    contagemRegressiva(10);
  }
  //funcoesRecursivas
  public static void contagemRegressiva(int num){

    if(num < 0){
      return;
    }
    
    System.out.println(num);
    contagemRegressiva(num -1);
  }
}