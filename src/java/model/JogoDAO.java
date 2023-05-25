package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JogoDAO {
        private static Connection conn;
        
        public JogoDAO() throws ClassNotFoundException, SQLException {
            conn = MyConnection.getConnection();
        }
        
        //INSERT
        public void insertJogo(Jogo jogo) throws SQLException{
           //Criando a query genérica
            String sql = "INSERT INTO jogos(nome, valor, genero, imagem, console)"
                                        + "VALUES (?, ?, ?, ?, ?)";
            
            //Instanciando o objeto de conexão informando a query
            PreparedStatement prep = conn.prepareStatement(sql);
            
            //Informando os parâmetros enviados para a query
            prep.setString(1, jogo.getNome());
            prep.setDouble(2, jogo.getValor());
            prep.setString(3, jogo.getGenero());
            prep.setString(3, jogo.getImagem());
            prep.setString(3, jogo.getConsole());
            
            prep.execute(); //Lançando o SQL pronto na base de dados
            prep.close();
        }//Fim do método insertJogo
        
        
        //SELECT
        public ArrayList<Jogo> listJogo() throws SQLException {
            //Criação de uma lista vazia (específica de Jogos)
            ArrayList<Jogo> list = new ArrayList<>();
            
            String sql = "SELECT * FROM jogos";
            PreparedStatement prep = conn.prepareStatement(sql);
            
            ResultSet result = prep.executeQuery();
            
            //Enquanto existirem registros, executará este laço de repetição
            while(result.next()) {
                //Criar um objeto vazio da classe Jogo
                Jogo jogo = new Jogo();
                
                //Inserir os atributos a partir dos dados de cada coluna
                jogo.setCod(result.getInt("cod_jogo"));
                jogo.setNome(result.getString("nome"));
                jogo.setGenero(result.getString("genero"));
                jogo.setValor(result.getDouble("valor"));
                jogo.setImagem(result.getString("imagem"));
                jogo.setConsole(result.getString("console"));
                
                //Inserir o objeto preenchido na lista
                list.add(jogo);
            }
            
            return list;
        }//Fim do método listJogo
        
        
        //DELETE
        public void deleteJogo(int id) throws SQLException {
            String sql = "DELETE FROM jogos WHERE cod_jogo = " + id;
            
            PreparedStatement prep = conn.prepareStatement(sql);
            
            prep.execute();
            prep.close();
        }//Fim do método deleteJogo
        
        
        //SELECT BY ID
        public Jogo listOneJogo(int cod) throws SQLException {
             String query = "SELECT * FROM jogos WHERE cod_jogo = " + cod;
             
             PreparedStatement prep = conn.prepareStatement(query);
             
             ResultSet result = prep.executeQuery();
             
             Jogo jogo = new Jogo();
             
             if(result.next()){
                jogo = new Jogo(
                        result.getInt("cod_jogo"),
                        result.getString("nome"),
                        result.getDouble("valor"),
                        result.getString("genero"),
                        result.getString("imagem"),
                        result.getString("console")
                );
             }             
             return jogo;
        }
        
        
        //UPDATE
        public void updateJogo(Jogo jogo) throws SQLException {
            //Query genérica
            String query = "UPDATE jogos SET nome = ?, "
                    + "valor = ?, genero = ?, imagem = ?, console = ?"
                    + "WHERE cod_jogo = ?";
            
            //Preparando a query para executar no BD
            PreparedStatement prep = conn.prepareStatement(query);
            
            //Trocar as interrogações por valores do objeto enviado
            prep.setString(1, jogo.getNome());
            prep.setDouble(2, jogo.getValor());
            prep.setString(3, jogo.getGenero());
            prep.setString(4, jogo.getImagem());
            prep.setString(4, jogo.getConsole());
            
            //Executar query pronta
            prep.execute();
            prep.close();
        }
        
}//Fim da classe