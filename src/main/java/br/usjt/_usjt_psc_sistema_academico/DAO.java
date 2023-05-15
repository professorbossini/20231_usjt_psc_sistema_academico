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
public class DAO {
    public boolean existe (Usuario usuario) throws Exception{
        //1. Especificar o comando SQL
        String sql = "SELECT nome, senha FROM tb_usuario WHERE nome = ? AND senha = ?";
        //2. Abrir uma conexão com o banco
        //try-with-resources
        //3. Preparar o comando
        try(
            Connection conexao = ConexaoBD.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
        ){
            //4. Substituir os eventuais placeholders
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            //5. Executar o comando
            try(
                ResultSet rs = ps.executeQuery();
            ){
                //6. Manipular os dados obtidos
                return rs.next();
            }
            //7. Fechar os recursos (já foi feito pelo try-with-resources)
        }
    }
}
