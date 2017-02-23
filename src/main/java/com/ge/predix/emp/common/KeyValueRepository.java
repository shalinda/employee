package com.ge.predix.emp.common;

import com.ge.predix.emp.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Iterator;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
public interface KeyValueRepository extends CrudRepository<KeyValue, String> {

    Iterator<KeyValue> findByValue(@Param("value") String value);

    KeyValue findByKey(@Param("key") String key, @Param("type") String type);

    Iterator<KeyValue> findByType(@Param("type") String type);
}
