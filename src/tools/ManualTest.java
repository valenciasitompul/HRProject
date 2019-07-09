/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.CountryDAO;
import idaos.ICountryDAO;
import models.Country;

/**
 *
 * @author HARRY-PC
 */
public class ManualTest {
    public static void main(String[] args) {
        //fugsi test untuk model
//        Country country = new Country();
//        country.setId("0");
//        country.setName("country");
//        country.setRegion_id(0);
//        System.out.println(country.getId()+ " " + country.getName() + " " + country.getRegion_id());
//        
//        Country c = new Country("AA", "New Country", 1);
//        System.out.println(c.getId()+ " " + c.getName() + " " + c.getRegion_id());
        
        //fungsi test koneksi database
        Koneksi koneksi = new Koneksi();
//        System.out.println(koneksi);

        ICountryDAO icdao = new CountryDAO(koneksi.getConnection());
        for(Country country : icdao.getAll()){
            System.out.println(country.getId());
            System.out.println(country.getName());
            System.out.println(country.getRegion_id());
        }
    }
}
