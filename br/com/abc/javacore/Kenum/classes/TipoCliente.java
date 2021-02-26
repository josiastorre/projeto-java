package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
    // constant specific class body
    // corpo de constante de classe específica
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica") {
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return "A";
    }


    public int getTipo() {
        return tipo;
    }
}


