/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Job;

/**
 *
 * @author Bella
 */
public interface IJobDAO {

    /**
     * fungsi untuk mendapatkan/menampilakan semua data yaitu job id, job title,
     * minimal salary dan maksimal salary dari tabel JOBS
     *
     * @return nilai kembalian berupa list
     */
    public List<Job> getAll();

    /**
     * fungsi untuk melakukan pencarian pada tabel JOBS
     *
     * @param key bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Job> search(String key);

    /**
     * fungsi untuk menambahkan data baru yaitu job id, job title, minimal
     * salary dan maksimal salary pada tabel JOBS atau untuk mengubah data job
     * title, minimal salary dan maksimal salary pada tabel JOBS pada saat
     * mengubah data, job id tidak dapat diubah
     *
     * @param j bertipe Job
     * @param isUpdate bertipe boolean
     * @return nilai kembalian berupa boolean
     */
    public boolean insertupdate(Job j, boolean isUpdate);

    /**
     * fungsi untuk menghapus data pada tabel JOBS berdasarkan job id
     *
     * @param id bertipe string
     * @return nilai kembalian berupa boolean
     */
    public boolean delete(String id);

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

}
