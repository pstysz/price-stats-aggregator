package com.stats.aggregator.business.services.contracts;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Container for results of services methods
 * @param <TResult> result type
 */
public class ServiceResult<TResult> {
    private TResult result;
    private boolean isSuccess;
    private HttpStatus status;
    private Exception exception;
    private List<String> errorDescriptions;

    public ServiceResult(){
        this.setSuccess(true);
        this.setStatus(HttpStatus.OK);
        this.setErrorDescriptions(new ArrayList<>());
    }

    public ServiceResult(TResult result){
        this();
        this.setResult(result);
    }

    public ServiceResult(Exception exception, HttpStatus status){
        this();
        this.setException(exception);
        this.setSuccess(false);
        this.setStatus(status);
        getErrorDescriptions().add(exception.getMessage());
    }

    public ServiceResult(HttpStatus status, boolean  isSuccess){
        this();
        this.setStatus(status);
        this.setSuccess(isSuccess);
    }

    public ServiceResult(HttpStatus status){
        this();
        this.setStatus(status);
        this.setSuccess(false);
    }

    public TResult getResult() {
        return result;
    }

    public void setResult(TResult result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public List<String> getErrorDescriptions() {
        return errorDescriptions;
    }

    public void setErrorDescriptions(List<String> errorDescriptions) {
        this.errorDescriptions = errorDescriptions;
    }
}

