package distribute;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/6/5
 * Time: 12:54
 * Description: No Description
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2283690802430798951L;
    private String name ;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
