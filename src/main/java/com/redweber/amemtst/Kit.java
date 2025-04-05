package com.redweber.amemtst;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pmt")
public class Kit {

    @Id
    private String id;
    private String testParameter1;
    private String testParameter2;
    private String testParameter3;
    private String testParameter4;
    private String testParameter5;

    public Kit() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestParameter1() {
        return testParameter1;
    }

    public void setTestParameter1(String testParameter1) {
        this.testParameter1 = testParameter1;
    }

    public String getTestParameter2() {
        return testParameter2;
    }

    public void setTestParameter2(String testParameter2) {
        this.testParameter2 = testParameter2;
    }

    public String getTestParameter3() {
        return testParameter3;
    }

    public void setTestParameter3(String testParameter3) {
        this.testParameter3 = testParameter3;
    }

    public String getTestParameter4() {
        return testParameter4;
    }

    public void setTestParameter4(String testParameter4) {
        this.testParameter4 = testParameter4;
    }

    public String getTestParameter5() {
        return testParameter5;
    }

    public void setTestParameter5(String testParameter5) {
        this.testParameter5 = testParameter5;
    }

    @Override
    public String toString() {
        return "Kit{" +
                "id='" + id + '\'' +
                ", testParameter1='" + testParameter1 + '\'' +
                ", testParameter2='" + testParameter2 + '\'' +
                ", testParameter3='" + testParameter3 + '\'' +
                ", testParameter4='" + testParameter4 + '\'' +
                ", testParameter5='" + testParameter5 + '\'' +
                '}';
    }
}