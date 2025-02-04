package com.example.homeservice.repositories;

import com.example.homeservice.models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {
    ServiceProvider findByEmail(String email);
}
