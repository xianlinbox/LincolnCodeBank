package com.ning.domain;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/7/12
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class JsonResponse {
    private String status = null;
    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
