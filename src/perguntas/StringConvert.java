package perguntas;

public class StringConvert {
    public static void main(String[] args) {
        System.out.println(convert("Oi"));
    }

    public static  String convert(String palavra){
        String reversa ="";
        if(palavra == null)
            return palavra;

        for(int i = palavra.length() -1 ; i >= 0 ; i-- ){
            reversa = reversa + palavra.charAt(i);
        }
        return reversa;
    }
}
