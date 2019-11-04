package albo.test.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarvelCharacter {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", insertable=true, updatable=false, unique=true, nullable=false)
    private Integer id;
    @Column(name="name", insertable=true, updatable=false, unique=true, nullable=false)
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
