//Implemente um programa em Java que calcule o fatorial de um número
//informado pelo usuário.
class Exer02 {
  public static void main(String[] args) {
    int fat = fatorial(5);
    System.out.println(fat);
  }
  public static int fatorial(int num){

    if(num == 1){
      return 1;
    }    
    return num * fatorial(num -1);
  }
}