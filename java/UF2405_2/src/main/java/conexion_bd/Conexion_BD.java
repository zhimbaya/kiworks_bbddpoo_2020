/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_bd;
import Codigos.Conectar;

/**
 *
 * @author Randy
 */
public class Conexion_BD {
    public static void main(String[] args) {
        Conectar con = new Conectar();
        con.conectado();
        con.desconectar();
        
    }
}
