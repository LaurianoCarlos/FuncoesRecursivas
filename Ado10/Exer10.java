class Exer10 {
  public static void main(String[] args) {
    boolean sum = verificar("loro");
    System.out.println(sum);
  }

  public static String separarTexto(String texto) {
       if(texto.length() <=1){
         return texto;
       }else{
         String primeiroCaracter = texto.substring(0,1);
         
         String restoDoTexto = texto.substring(1);
         
         String continuarTexto = separarTexto(restoDoTexto);

         return continuarTexto + primeiroCaracter;
    }  
  }
  public static boolean verificar(String texto){

    if(texto.length() <= 1){
      return false;
    }else{
      String primeiroCaracter = texto.substring(0,1);
         
         String restoDoTexto = texto.substring(1);
         
         String continuarTexto = separarTexto(restoDoTexto);

         String frase = continuarTexto + primeiroCaracter;

      return texto.equalsIgnoreCase(frase);

      
    }
  }
}