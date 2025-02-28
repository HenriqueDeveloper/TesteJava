package dao;
import java.sql.Connection;

public interface IConexao {

        public Connection getConnection();

        public void closeConnetion();
}