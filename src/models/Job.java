/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Bella
 */
public class Job {

    private String id;
    private String title;
    private int min, max;

    /**
     * Constructor
     */
    public Job() {
    }

    /**
     * Consturctor empat parameter (job id, job title, min salary, dam max
     * salary)
     *
     * @param id bertipe string
     * @param title bertipe string
     * @param min bertipe integer
     * @param max bertipe integer
     */
    public Job(String id, String title, int min, int max) {
        this.id = id;
        this.title = title;
        this.min = min;
        this.max = max;
    }

    /**
     * fungsi untuk mendapatkan job id
     *
     * @return nilai kembalian berupa string
     */
    public String getId() {
        return id;
    }

    /**
     * fungsi untuk mendapatkan job title
     *
     * @return nilai kembalian berupa string
     */
    public String getTitle() {
        return title;
    }

    /**
     * fungsi untuk mendapatkan minimal salary
     *
     * @return nilai kembalian berupa integer
     */
    public int getMin() {
        return min;
    }

    /**
     * fungsi untuk mendapatkan maksimal salary
     *
     * @return nilai kembalian berupa integer
     */
    public int getMax() {
        return max;
    }

    /**
     * fungsi untuk mengatur job id
     *
     * @param id bertipe string
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * fungsi untuk mengatur job title
     *
     * @param title bertipe string
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * fungsi untuk mengatur minimal salary
     *
     * @param min bertipe integer
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * fungsi untuk mengatur maksimal salary
     *
     * @param max bertipe integer
     */
    public void setMax(int max) {
        this.max = max;
    }
}
