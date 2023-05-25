package model;

import java.sql.SQLException;

public class User {
    //Atributos
    private int userId;
    private String userName;
    private String userPass;
    private String userNick;
    
    //Construtor
    public User(){}
    
    public User(String user, String pass) {
        this.userName = user;
        this.userPass = pass;
    }
    
    //Getters & Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
        
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String name) {
        this.userName = name;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
    
    //toString = Representação em formato String do Objeto
    @Override
    public String toString() {
        return "Nome: " +  this.userName +
                "<br>Console: "  + this.userNick +
                "<br>Valor Do Produto: " + this.userPass;
    }
    
    //Métodos gerais (regras de negócio)
    public boolean isLogged() throws ClassNotFoundException, SQLException {
        UserDAO u = new UserDAO();
        User uBanco = u.listOneUser(this.userName);
        
        if(uBanco.getUserName() != null){
            return (uBanco.getUserPass().equals(this.userPass));
        } else {
            return false;
        }
    }
        
}
