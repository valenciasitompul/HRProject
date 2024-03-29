/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Job;

/**
 *
 * @author Bella
 */
public interface IJobController {

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title,
     * minimal salary dan maksimal salary dari tabel JOBS
     *
     * @return nilai kembalian berupa list
     */
    public List<Job> getAll();

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title,
     * minimal salary dan maksimal salary dari tabel JOBS berdasarkan job id
     *
     * @param id bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Job> getById(String id);

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title,
     * minimal salary dan maksimal salary dari tabel JOBS berdasarkan job title
     *
     * @param title bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Job> getByTitle(String title);


    /**
     * fungsi untuk menambahkan data baru yaitu job id, job title, minimal
     * salary dan maksimal salary pada tabel JOBS
     *
     * @param id bertipe string
     * @param title bertipe string
     * @param min bertipe string
     * @param max bertipe string
     * @return nilai kembalian berupa string
     */
    public String insert(String id, String title, String min, String max);

    /**
     * fungsi untuk mengubah data job title, minimal salary dan maksimal salary
     * pada tabel JOBS pada saat mengubah data, job title tidak dapat diubah
     *
     * @param id bertipe string
     * @param title bertipe string
     * @param min bertipe string
     * @param max bertipe string
     * @return nilai kembalian berupa string
     */
    public String update(String id, String title, String min, String max);

    /**
     * fungsi untuk menghapus data pada tabel JOBS berdasarkan job id
     *
     * @param id bertipe string
     * @return nilai kembalian berupa string
     */
    public String delete(String id);
}
