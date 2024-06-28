package com.example.refundmodule.persistence.repository;

import com.example.refundmodule.persistence.model.Refund;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundRepository extends CrudRepository<Refund, Long> {
}
