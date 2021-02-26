package br.com.abc.javacore.Zcolecoes.classes;

import java.util.Comparator;



public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    //Reflexivo: "x.equals(x)" tem que ser "true" para tudo que for diferente de "null"
    //Simétrico: para "x" e "y" diferentes de "null", se "x.equals(y) == true" logo "y.equals(x)" tem que ser "true".
    //Transitividade: para "x", "y", "z" diferentes de "null", se "x.equals(y) == true", logo "y.equals(x) == true" e "x.equals(z) == true" logo "y.equals(z)" também tem que ser "true".
    //Consistente: "x.equals(y)" deve sempre retrornar o mesmo valor.
    // para "x" diferente ("!=") de "null" ("x.equals(null)") tem que retornar "false".
    //Se "x.equals(y) == true" então "y.hashCode() == x.hashCode();"
    //Se "y.hashCode() == x.hashCode()" não necessarioamente o "equals" deverá retornar "true".
    //Se "x.equals(y)" retornou "false", tudo é "false".
    //Se "y.hashCode() != x.hashCode()" então "x.equals(y)" deverá ser "false".

    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
