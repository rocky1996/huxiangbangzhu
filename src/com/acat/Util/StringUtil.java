package com.acat.Util;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-04-27
 */
public class StringUtil {

    public static class StringEntity{

       public String text;

       public Map<String,String> params;
    }

    private static StringEntity function(String text){
        StringEntity stringEntity = new StringEntity();

        String[] str = text.split("\\.");
        System.out.println(str[0]+":"+str[1]);
        stringEntity.params.put(str[0],str[1]);
        return stringEntity;
    }

    public static void main(String[] args) {
        StringEntity stringEntity = StringUtil.function("http.ok");
        System.out.println(stringEntity.params);
    }

}
