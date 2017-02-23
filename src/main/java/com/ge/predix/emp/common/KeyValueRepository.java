package com.ge.predix.emp.common;

import com.ge.predix.emp.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
public interface KeyValueRepository extends CrudRepository<KeyValue, String> {

    KeyValue findByValue(String value);

    KeyValue findByKey(String key);

    KeyValue findByType(String type);
}
