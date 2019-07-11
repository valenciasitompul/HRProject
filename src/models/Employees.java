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
    private String pnumber;
    private String email;
    private String name;
    private String hireDate;
    private String jobId;
    private String jobTitle;
    private int salary;
    private int commissionpct;
    private int managerid;
    private String managerName;
    private int departmentid;
    private String departmentName;
    
    public Employees(){
        
    }

    public Employees(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
    
    public Employees(int id, String name, String hireDate, String jobTitle, String managerName, String departmentName){
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.managerName = managerName;
        this.departmentName = departmentName;
    }
    
    public Employees(int id, String fname, String lname, String email, String pnumber, String hireDate, String jobId, int salary, int commissionpct, int managerid, int departmentid){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.pnumber = pnumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
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
        return hireDate;
    }
    
    public String getJobid(){
        return jobId;
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
    
    public void setHiredate(String hireDate){
        this.hireDate = hireDate;
    }
    
    public void setJobid(String jobId){
        this.jobId = jobId;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the managerName
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * @param managerName the managerName to set
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
