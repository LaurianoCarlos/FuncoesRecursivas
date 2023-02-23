class Exer04 {
  public static void main(String[] args) {
    int sum = somarPares(5, 10);
    System.out.println(sum);
  }

  public static int somarPares(int inicio, int fim) {
    if (inicio > fim) {
      return 0;
    }
//continua a contagem se for impar sendo assim pulando os numeros impares
    if (inicio % 2 == 1) {
      inicio = inicio + 1;
    }

    return inicio + somarPares(inicio + 2, fim);
  }
}
