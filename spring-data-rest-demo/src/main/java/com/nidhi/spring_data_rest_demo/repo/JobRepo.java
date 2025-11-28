package com.nidhi.spring_data_rest_demo.repo;

import com.nidhi.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    //List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}