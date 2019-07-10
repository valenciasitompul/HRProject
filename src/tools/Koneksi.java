/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author HARRY-PC
 */
public class Koneksi {
    private Connection connection;
    
    public Connection getConnection(){
        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setServerName("localhost");
            ods.setPortNumber(1521);
            ods.setUser("system");
            ods.setPassword("rifkiozy800");
            ods.setServiceName("XE");
            ods.setDriverType("thin");
            connection = ods.getConnection();
            connection.createStatement().execute("alter session set current_schema = HR");
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
