package models;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
    @Table(name = "usuarios")

    public class Usuarios {


    @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         @Column(name = "id")
         private  int id;



    @Column(name = "nome", length = 255, nullable = false )
        private String nome;


    @Column(name = "email" ,length = 255, nullable = false)
        private  String email;

        @Column(name = "senha", length = 100, nullable = false)
        private  String senha;



        @Column(name = "conteudo", columnDefinition = "text")
        private String conteudo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    }
