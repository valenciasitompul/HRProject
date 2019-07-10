/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.CountryController;
import daos.CountryDAO;
import daos.DepartmentDao;
import daos.EmployeesDAO;
import daos.LocationDAO;
import icontrollers.ICountryController;
import idaos.ICountryDAO;
import idaos.IEmployeesDAO;
import models.Country;
import models.Department;
import models.Region;
import idaos.IDepartmentDao;
import idaos.ILocationDAO;
import models.Location;


/**
 *
 * @author HARRY-PC
 */
public class ManualTest {
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        IDepartmentDao idd = new DepartmentDao(koneksi.getConnection());
        for(Department d : idd.getByName("bebas") ){
            System.out.println(d.getdptid());
            System.out.println(d.getdptname());
        }
//        Department d = new Department("15", "IT", 103, 1400);
//        idd.insertupdate(d, true);
        //ILocationDAO ildao = new LocationDAO(koneksi.getConnection());
//        ICountryDAO icdao = new CountryDAO(koneksi.getConnection());
//        for(Country c : icdao.getAll()){
//            System.out.println(c.getId());
//            System.out.println(c.getName());
//            System.out.println(c.getRegion_id());
//        }
    }
//    public static void main(String[] args) {
//        //fungsi test untuk model
////        Country country = new Country();
////        country.setId("0");
////        country.setName("country");
////        country.setRegion_id(0);
////        System.out.println(country.getId()+ " " + country.getName() + " " + country.getRegion_id());
////        
////        Country c = new Country("AA", "New Country", 1);
////        System.out.println(c.getId()+ " " + c.getName() + " " + c.getRegion_id());
//        
//        //merupakan objek instasiasi koneksi
//        Koneksi koneksi = new Koneksi();
//        //fungsi test koneksi database
////        System.out.println(koneksi);
//     
//          //IEmployeesDAO iemdao = new EmployeesDAO(koneksi.getConnection());
//        //fungsi test method getAll, getById dan search dari class CountryDAO
////        for(Region r : icdao.getRegionId()){
////            System.out.println(r.getId());
////            System.out.println(country.getName());
////            System.out.println(country.getRegion_id());
////        }
//        //fungsi test method insertupdate dari class CountryDAO
//        //System.out.println(icdao.insertupdate(new Country("ID", "Indonesia", 3), true));
//        
//        //fungsi test methof delete dari class CountryDAO
////        System.out.println(icdao.delete("ID"));
//          //System.out.println(iemdao.delete(999));
//          
//          ICountryController icc = new CountryController(koneksi.getConnection());
//          //fungsi test method getAll, getById dan search dari class CountryController
////          for (Country country : icc.getJustId()) {
////              System.out.println(country.getId());
//////              System.out.println(country.getName());
//////              System.out.println(country.getRegion_id());
////          }
//            for(Region r : icc.getRegionId()){
//                System.out.println(r.getId());
////                System.out.println(country.getName());
////                System.out.println(country.getRegion_id());
//            }
//        //System.out.println(icc.delete("ID"));
//    }
}
