/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.misc;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.Jsonizable;
import com.creditcloud.model.enums.BaseEnum;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * 表示一次身份证验证查询的返回结果
 *
 * @author sobranie
 */
public class CheckIDResult extends BaseObject implements Jsonizable<CheckIDResult> {

    /**
     * 远端返回检查结果的类型
     */
    public enum ResultType implements BaseEnum {

        MATCH("身份证匹配"),
        MATCH_NO_PIC("匹配，照片缺失"),
        UNMATCH_NAME("姓名不匹配"),
        UNMATCH_IDNUMBER("身份证号码不存在"),
        ERROR_PARAM("查询参数错误"),
        ERROR_OTHER("其他错误");

        private final String key;

        ResultType(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    private ResultType resultType;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * base64编码的头像照片.
     *
     * 当匹配时，有极小的可能性不存在
     */
    private String picture;

    /**
     * 表示结果是否是从缓存中来的
     */
    private boolean cacheHit;

    /**
     * 错误信息
     */
    private String errorMessage;

    public CheckIDResult() {
    }

    public CheckIDResult(ResultType resultType,
                         String idNumber,
                         String name,
                         String picture,
                         boolean cacheHit,
                         String errorMessage) {
        this.resultType = resultType;
        this.idNumber = idNumber;
        this.name = name;
        this.picture = picture;
        this.cacheHit = cacheHit;
        this.errorMessage = errorMessage;
    }

    public ResultType getResultType() {
        return resultType;
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isCacheHit() {
        return cacheHit;
    }

    public void setCacheHit(boolean cacheHit) {
        this.cacheHit = cacheHit;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public CheckIDResult fromJsonString(String jsonString) {
        JsonObject jo = Json.createReader(new StringReader(jsonString)).readObject();
        setResultType(ResultType.valueOf(jo.getString("resultType")));
        setIdNumber(jo.getString("idNumber"));
        setName(jo.getString("name"));
        setPicture(jo.getString("picture"));
        setCacheHit(jo.getBoolean("cacheHit"));
        setErrorMessage(jo.getString("errorMessage"));
        return this;
    }

    @Override
    public String toJsonString() {
        return Json.createObjectBuilder()
                .add("resultType", getResultType().toString())
                .add("idNumber", getIdNumber())
                .add("name", getName())
                .add("picture", getPicture())
                .add("cacheHit", isCacheHit())
                .add("errorMessage", getErrorMessage())
                .build().toString();
    }
}
