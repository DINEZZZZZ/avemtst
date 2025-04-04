package com.redweber.amemtst;



import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pmt")
public class Kit {
    @Id
    private String id;
    private String testParameter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestParameter() {
        return testParameter;
    }

    public void setTestParameter(String testParameter) {
        this.testParameter = testParameter;
    }

    public Kit(String id, String testParameter) {
        this.id = id;
        this.testParameter = testParameter;
    }

    @Override
    public String toString() {
        return "Kit{" +
                "id='" + id + '\'' +
                ", testParameter='" + testParameter + '\'' +
                '}';
    }
}

