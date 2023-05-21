/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author willi
 */
public class ContatoProfissional extends Contato{
    private String empresaOndeTrabalha;
    private String cargo;

    public ContatoProfissional(int numeroDoContato, String nomeDoContato, String endereco, String telefone, String email, String empresaOndeTrabalha, String cargo) {
        super(numeroDoContato, nomeDoContato, endereco, telefone, email);
        setEmpresaOndeTrabalha(empresaOndeTrabalha);
        setCargo(cargo);
    }
    
    public String getEmpresaOndeTrabalha() {
        return empresaOndeTrabalha;
    }

    public void setEmpresaOndeTrabalha(String empresaOndeTrabalha) {
        this.empresaOndeTrabalha = empresaOndeTrabalha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void mostraDetalheContato(){
        System.out.println("ID: " + getNumeroDoContato() + " | Nome: " + getNomeDoContato() +
                "\nEndereço: " + getEndereco() + " | Telefone: " + getTelefone() + 
                "\nEmail: " + getEmail() +
                "\nEmpresa: " + getEmpresaOndeTrabalha() + " | Cargo: " + getCargo());
    }
    
}
