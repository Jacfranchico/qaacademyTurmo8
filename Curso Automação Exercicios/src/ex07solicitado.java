public class ex07solicitado {
    public static void main (String [] args ){
        //ler todos os meses do ano, armazene um vetor.
        String[] ano2023;

        int y = 0;
        while (y <12){
            ano2023 = new String[12];
            ano2023[0] = ("janeiro");
            ano2023[1] = ("fevereiro");
            ano2023[2] = ("março");
            ano2023[3] = ("abril");
            ano2023[4] = ("maio");
            ano2023[5] = ("junho");
            ano2023[6] = ("julho");
            ano2023[7] = ("agosto");
            ano2023[8] = ("setembro");
            ano2023[9] = ("outubro");
            ano2023[10] = ("novembro");
            ano2023[11] = ("dezembro");


            System.out.println(ano2023[y]); 
            y = y +1;
        }
      
    }
    
}