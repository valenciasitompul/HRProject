/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import icontrollers.IRegionController;
import idaos.IRegionDAO;
import java.sql.Connection;
import java.util.List;
import models.Region;

/**
 *
 * @author HARRY-PC
 */
public class RegionController implements IRegionController{
    
    private IRegionDAO irdao;
    
    public RegionController(Connection connection){
        irdao = new RegionDAO(connection);
    }

    @Override
    public List<Region> getAll() {
        return irdao.getAll();
    }

    @Override
    public List<Region> getById(String id) {
        return irdao.getById(Integer.parseInt(id));
    }
    
    public List<Region> getByName(String name) {
        return irdao.getByName(name);
    }
    

    @Override
    public String insert(String id, String name) {
        String result = "";
        Region region = new Region(Integer.parseInt(id),name);
        if(irdao.insertupdate(region, false)){
            result = "Data berhasil disimpan";
        }else{
            result = "Maaf Data gagal disimpan";
        }
        return result;
    }

    @Override
    public String update(String id, String name) {
        String result = "";
        Region region = new Region(Integer.parseInt(id),name);
        if(irdao.insertupdate(region, true)){
            result = "Data berhasil diupdate";
        }else{
            result = "Maaf Data gagal diupdate";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "";
        if(irdao.delete(Integer.parseInt(id))){
            result = "Data berhasil dihapus";
        }else{
            result = "maaf data gagal dihapus";
        }
        return result;
    }
    
}
