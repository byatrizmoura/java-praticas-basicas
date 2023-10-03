package edu.byatriz.praticasjava;

public class MinhaClasse {

//metodo main - void (vazio) / (tipo) String  / (array) [] / args (argumentos/parametros)
public static void main (String [] args) {

    String primeiroNome = "Byatriz";
    String segundoNome = "Moura";

    // posso ter uma variavel com o mesmo nome de um metodo, mas o metodo sempre terá seus parametros ();
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}
}
