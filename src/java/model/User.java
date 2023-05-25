package model;

public class User {
    //Atributos
    private String userName;
    private String userPass;
    private String userNick;
    
    //Construtor
    public User(String user, String pass) {
        this.userName = user;
        this.userPass = pass;
    }
    
    //Getters & Setters
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
    public boolean isLogged() {
        return (this.userName.equals("Escobar") &&
                        this.userPass.equals("interfifa"));
    }
        
}
