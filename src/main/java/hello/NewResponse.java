package hello;

import java.io.Serializable;

public class NewResponse implements Serializable {
    private final Integer sum;
    private final Integer code;
    private final String status;

    public NewResponse(Integer sum, Integer code, String status) {
        this.sum = sum;
        this.code = code;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public Integer getSum() {
        return sum;
    }
}

