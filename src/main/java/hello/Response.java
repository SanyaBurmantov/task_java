package hello;

import java.io.Serializable;

public class Response implements Serializable {
    private final Integer code;
    private final String status;

    public Response(Integer code, String status) {
        this.code = code;
        this.status = status;
    }


    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }
}

