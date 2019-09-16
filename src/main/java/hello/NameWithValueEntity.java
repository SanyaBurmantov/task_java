package hello;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "name_with_value")
public class NameWithValueEntity {
    @Id
    private String name;
    private Integer value;

    public NameWithValueEntity(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public NameWithValueEntity() {
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
