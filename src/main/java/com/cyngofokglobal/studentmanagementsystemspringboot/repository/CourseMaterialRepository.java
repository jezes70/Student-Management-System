package com.cyngofokglobal.studentmanagementsystemspringboot.repository;

import com.cyngofokglobal.studentmanagementsystemspringboot.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {


}
