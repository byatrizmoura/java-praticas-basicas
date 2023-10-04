public class TiposVariaveis {
    public static void main (String [] args) throws Exception {
        byte idade = 123;
        short ano = 2011;
        int cep = 29155255; // se começar com 0, talvez tenha que usar outro tipo como String
        long cpf = 65465452858L; // se começar com 0, talvez tenha que usar outro tipo como String E necessário ccolocar um L/l ao final pois pde dar erro achando que deveria ter colocado int
        float pi = 3.14F; // necessário ccolocar um F/f ao final pois pde dar erro achando que deveria ter colocado double
        double salario = 2154.54;
    }
}
