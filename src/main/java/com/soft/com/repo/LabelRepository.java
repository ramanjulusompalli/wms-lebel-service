package com.soft.com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soft.com.entity.LabelEntity;

@Repository
public interface LabelRepository extends JpaRepository<LabelEntity,String> ,LabelMapper{
	
	
	Optional<LabelEntity> findByLabelId(String labelId);

}
