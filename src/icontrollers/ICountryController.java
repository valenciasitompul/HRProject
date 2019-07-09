/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Country;

/**
 *
 * @author alzena
 */
public interface ICountryController {
    public List<Country> getAll();
    public List<Country> getById(String id);
    public List<Country> search(String key);
    public String insert(String id, String name, String region_id);
    public String update(String id, String name, String region_id);
    public String delete(String id);
}
