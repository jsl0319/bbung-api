package com.bbung.api.test.repository;

import com.bbung.api.test.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {
//    Optional<Test> findById(Integer id);
}
