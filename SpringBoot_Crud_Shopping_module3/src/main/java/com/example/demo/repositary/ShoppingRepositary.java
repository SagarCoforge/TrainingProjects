package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Shopping;

public interface ShoppingRepositary {
	@Repository
	public interface CustomerRepositary extends JpaRepository<Shopping, Integer>{


}
}