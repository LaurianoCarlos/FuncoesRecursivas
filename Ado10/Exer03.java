///Implemente um programa em Java que calcule a soma dos números
//naturais pares de 1 até um número informado pelo usuário.

class Exer03 {
  public static void main(String[] args) {
    int sum = somarPares(10);
    System.out.println(sum);
  }

  public static int somarPares(int num){
    if (num == 0) {
      return 0;
    }

    if (num % 2 == 0) {
      return num + somarPares(num - 2);
    } else {
      return somarPares(num - 1);
    }
  }
}
