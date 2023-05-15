/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt._usjt_psc_sistema_academico;

/**
 *
 * @author rodrigo
 */
import java.sql.*;
public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "20231_usjt_psc_sistema_academico";
    private static String usuario = "root";
    private static String senha = "1234";
    
    public static Connection obterConexao() throws Exception{
        //1. montar a string de conexão
        String url = String.format(
            "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=America/Sao_Paulo",
            host, porta, db
        );
        //2. estabelecer o canal de comunicação (conexão) com o SGBD (MySQL)
        return DriverManager.getConnection(url, usuario, senha);
    }
    
}
