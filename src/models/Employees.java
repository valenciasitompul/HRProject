/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author HARRY-PC
 */
public class Employees {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String pnumber;
    private String hiredate;
    private String jobid;
    private int salary;
    private int commissionpct;
    private int managerid;
    private int departmentid;
    
    public Employees(){
        
    }

    public Employees(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
    
       
    public Employees(int id, String fname, String lname, String email, String pnumber, String hiredate, String jobid, int salary, int commissionpct, int managerid, int departmentid){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.pnumber = pnumber;
        this.hiredate = hiredate;
        this.jobid = jobid;
        this.salary = salary;
        this.commissionpct = commissionpct;
        this.managerid = managerid;
        this.departmentid = departmentid;
    }
    
    
    
    public int getId(){
        return id;
    }
    
    public String getFName(){
        return fname;
    }
    
    public String getLName(){
        return lname;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPNumber(){
        return pnumber;
    }
    
    public String getHiredate(){
        return hiredate;
    }
    
    public String getJobid(){
        return jobid;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public int getCommissionpct(){
        return commissionpct;
    }
    
    public int getManagerid(){
        return managerid;
    }
    
    public int getDepartmentid(){
        return departmentid;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setFName(String fname){
        this.fname = fname;
    }
    
    public void setLName(String lname){
        this.lname = lname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPNumber(String pnumber){
        this.pnumber = pnumber;
    }
    
    public void setHiredate(String hiredate){
        this.hiredate = hiredate;
    }
    
    public void setJobid(String jobid){
        this.jobid = jobid;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void setCommissionpct(int commissionpct){
         this.commissionpct = commissionpct;
    }
    
    public void setManagerid(int managerid){
        this.managerid = managerid;
    }
    
    public void setDepartmentid(int departmentid){
        this.departmentid = departmentid;
    }
}
