//Implemente um programa em Java que calcule a soma dos números
//naturais de 1 até um número informado pelo usuário.
class exer01 {
  public static void main(String[] args) {
    int soma = somarNaturais(5,1);
    int soma2 = somarNaturais(5);
    
    System.out.println(soma);
    System.out.println(soma2);
  }
  public static int somarNaturais(int num, int soma){

    if(num == 1){
      return soma;
    }
    soma = soma + num;

    return somarNaturais(num -1, soma);
  }
//ou com um parâmetro
  public static int somarNaturais(int num){

    if(num == 1){
      return 1;
    }
    return  num + somarNaturais(num -1);
  }
}