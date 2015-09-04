package com.hackathon.smart.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(collectionResourceRel = "equipment", path = "equipment")
public interface EquipmentRepository extends JpaRepository<Equipment, Serializable>{

}
