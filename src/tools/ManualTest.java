/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.CountryController;
import daos.CountryDAO;
import daos.EmployeesDAO;
import icontrollers.ICountryController;
import idaos.ICountryDAO;
import idaos.IEmployeesDAO;
import models.Country;

/**
 *
 * @author HARRY-PC
 */
public class ManualTest {
    public static void main(String[] args) {
        //fungsi test untuk model
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

//        ICountryDAO icdao = new CountryDAO(koneksi.getConnection());
          //IEmployeesDAO iemdao = new EmployeesDAO(koneksi.getConnection());
        //fungsi test method getAll, getById dan search dari class CountryDAO
//        for(Country country : icdao.search("1")){
//            System.out.println(country.getId());
//            System.out.println(country.getName());
//            System.out.println(country.getRegion_id());
//        }
        //fungsi test method insertupdate dari class CountryDAO
        //System.out.println(icdao.insertupdate(new Country("ID", "Indonesia", 3), true));
        
        //fungsi test methof delete dari class CountryDAO
//        System.out.println(icdao.delete("ID"));
          //System.out.println(iemdao.delete(999));
          
          ICountryController icc = new CountryController(koneksi.getConnection());
//          for (Country country : icc.search("1")) {
//              System.out.println(country.getId());
//              System.out.println(country.getName());
//              System.out.println(country.getRegion_id());
//          }

        System.out.println(icc.delete("ID"));
    }
}
