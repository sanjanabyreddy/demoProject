package com.demoProject.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface InventoryRepo extends JpaRepository<Inventory,Long> {

}
