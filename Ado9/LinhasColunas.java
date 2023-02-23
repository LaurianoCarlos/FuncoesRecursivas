class LinhasColunas {
  public static void main(String[] args) {

    exibirLinhas(3,3);
  }
  //funcoesRecursivas
  public static void linha(int num){

    if(num == 0){
      return;
    }
    System.out.print("*");

    linha(num - 1);
  }
  public static void exibirLinhas(int linhas, int qtdLinhas){

    if(qtdLinhas == 0){
      return;
    }
    linha(linhas);
    System.out.println();
    exibirLinhas(linhas, qtdLinhas - 1);
  }
}