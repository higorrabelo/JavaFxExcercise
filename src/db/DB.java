package db;

import MyExceptions.DbException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
   
    private static Connection conn=null;
    
   public static Connection getConnection(){
       if(conn==null){
           try{
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url,props);
                
           }
           catch(SQLException e){
               throw new DbException("Erro na Conexão com o banco de Dados",e.getMessage());
           }
       }
       return conn;
   }
   public void closeConnection(){
       if(conn!=null){
           try{
               conn.close();
           }
           catch(SQLException e){
               throw new DbException("Erro em fechar o Banco de Dados", e.getMessage());
           }
       }
   }
      public void closeConnection(Statement st){
       if(st!=null){
           try{
               st.close();
           }
           catch(SQLException e){
               throw new DbException("Erro em fechar a Chamada do Banco de Dados", e.getMessage());
           }
       }
   }
         public void closeConnection(ResultSet rs){
       if(rs!=null){
           try{
               rs.close();
           }
           catch(SQLException e){
               throw new DbException("Erro em fechar os Resultados do banco de dados", e.getMessage());
           }
       }
   }
    
   private static Properties loadProperties(){
    try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch(IOException e){
            throw new DbException("Erro de Banco de Dados","Falha ao Carregar o Arquivo de Propriedades"+e.getMessage());
        }
   }
    
}
