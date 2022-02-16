package Models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private Date nascimento;
    private Date cadastro;
    private String email;
    
    public Cliente(String nome, Date nascimento, String email){
        this.nome=nome;
        this.nascimento=nascimento;
        this.email=email;
    }
    public Cliente(Integer id, String nome, Date nascimento, Date cadastro, String email){
        this.id=id;
        this.nome=nome;
        this.nascimento=nascimento;
        this.cadastro=cadastro;
        this.email=email;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNascimento(Date nascimento){
        this.nascimento=nascimento;
    }
    public void setCadastro(Date cadastro){
        this.cadastro=cadastro;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public Date getNascimento(){
        return nascimento;
    }
    public Date getCadastro(){
        return cadastro;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: "+ getId());
        sb.append(" Nome: "+getNome());
        sb.append(" Data de Nascimento: "+getNascimento());
        sb.append(" Cadastro: "+getCadastro());
        sb.append(" Email: "+getEmail());
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
