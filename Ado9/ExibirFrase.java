class ExibirFrase {
  public static void main(String[] args) {

    exibirfrase("Bora codar", 0);
   
  }
  public static void exibirfrase(String frase, int num){
    int tamanho = frase.length();

    if(num == tamanho ){
      return;
    }
    System.out.println(frase.charAt(num));
    exibirfrase(frase, num + 1);
  }
}