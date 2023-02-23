class Fatorial {
  public static void main(String[] args) {

    int resposta = fatorial(5, 1);

    System.out.println(resposta);
  }

  // funcoesRecursivas
  public static int fatorial(int num, int fatorial) {

    if (num == 1)
      return fatorial;

    return fatorial(num - 1, fatorial * num);
  }
}