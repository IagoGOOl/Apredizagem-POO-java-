public class Program{
    public static void main(String[] args) {
        String [] nome = new String[]{"Maria", "Bob", "Alex"};
         for (int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
         }
         System.out.println("---------------------");
         for (String obj : nome){
            System.out.println(obj);
         }
    }
}