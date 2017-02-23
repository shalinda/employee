package com.ge.predix.emp.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by shalindaranasinghe on 2/22/17.
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
@Entity
public class KeyValue implements Serializable{

    @Id
    @Column(length = 10)
    private String key;

    @Column(length = 20)
    private String value;

    @Column(length = 10)
    private String type;

    protected KeyValue() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyValue keyValue = (KeyValue) o;

        if (key != null ? !key.equals(keyValue.key) : keyValue.key != null) return false;
        if (value != null ? !value.equals(keyValue.value) : keyValue.value != null) return false;
        return type != null ? type.equals(keyValue.type) : keyValue.type == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
