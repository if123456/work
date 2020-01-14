package day14.test2.Test2_2;

import javax.naming.NoPermissionException;

public class Person {
    private String name;
    private Integer lifeValue;

    public Person() {
    }

    public Person(String name, Integer lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(Integer lifeValue) throws NoLifeValueExption {
        if(lifeValue<0){
            throw new NoLifeValueExption("生命值不能为负数:"+lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
