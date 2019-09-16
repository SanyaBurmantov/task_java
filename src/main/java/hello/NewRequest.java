package hello;

import java.io.Serializable;

public class NewRequest implements Serializable {
    private String first;
    private String second;

    public NewRequest(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}

