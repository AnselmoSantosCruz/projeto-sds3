package com.devsuperior.dsvendas.repositorieis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {
	
}
