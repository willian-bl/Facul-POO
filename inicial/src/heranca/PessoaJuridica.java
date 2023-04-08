/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */
public class PessoaJuridica extends Pessoa{
    private long cnpj;
    private String razaosocial;

    public PessoaJuridica(String nome, String endereco, String telefone, long cnpj, String razaosocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaosocial = razaosocial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }
    
}
