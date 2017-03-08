package com.ge.predix.emp.repo;

import com.ge.predix.emp.domain.CarhireEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
public interface CarhireEventRepository extends CrudRepository<CarhireEvent, Integer> {

    List<CarhireEvent> findByEquipInitialAndEquipNum(@Param("equipInitial") String equipInitial, @Param("equipNum") Integer equipNum);
}
