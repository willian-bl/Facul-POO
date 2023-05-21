/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author willi
 */
public abstract class Contato {
    private int numeroDoContato; // id
    private String nomeDoContato;
    private String endereco;
    private String telefone;
    private String email;
    
    public Contato(int numeroDoContato, String nomeDoContato, String endereco, String telefone, String email){
        setNumeroDoContato(numeroDoContato);
        setNomeDoContato(nomeDoContato);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }
    
    public Contato(int numeroDoContato, String nomeDoContato, String endereco, String telefone){
        setNumeroDoContato(numeroDoContato);
        setNomeDoContato(nomeDoContato);
        setEndereco(endereco);
        setTelefone(telefone);
    }
    
    public int getNumeroDoContato(){
        return this.numeroDoContato;
    }
    
    public void setNumeroDoContato(int numero){
        this.numeroDoContato = numero;
    }

    public String getNomeDoContato() {
        return nomeDoContato;
    }

    public void setNomeDoContato(String nomeDoContato) {
        this.nomeDoContato = nomeDoContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public abstract void mostraDetalheContato();
            
}
