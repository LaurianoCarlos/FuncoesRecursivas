class Exer07 {
  public static void main(String[] args) {
    String sum = separarTexto("hora de codar");
    System.out.println(sum);
  }

  public static String separarTexto(String texto) {
    
       if(texto.length() <=1){
         return texto;
         
       }else{
         
         String primeiroCaracter = texto.substring(0,1);
         
         String restoDoTexto = texto.substring(1);
         
         String continuarTexto = separarTexto(restoDoTexto);

         return primeiroCaracter + "-" + continuarTexto;
       }
  }
}