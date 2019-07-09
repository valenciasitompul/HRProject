/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.ICountryDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.Region;
import models.Country;

/**
 *
 * @author HARRY-PC
 */
public class CountryDAO implements ICountryDAO{
    private Connection connection;
    
    public CountryDAO(Connection connection){
        this.connection = connection;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public List<Country> getAll() {
        List<Country> listCountry = new ArrayList<Country>();
        String query = "SELECT * FROM COUNTRIES ORDER BY COUNTRY_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Country c = new Country(resultSet.get =, resultSet.getString(2), resultSet.getInt(3));
                
                listCountry.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listCountry;
    }
    /**
     *
     * @param id
     * @return 
     */
    @Override
    public List<Country> getAllById(char id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * 
     * @param key
     * @return 
     */
    @Override
    public List<Country> search(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * 
     * @param c
     * @param isUpdate
     * @return 
     */
    @Override
    public boolean insertupdate(Country c, boolean isUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public boolean delete(char id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
