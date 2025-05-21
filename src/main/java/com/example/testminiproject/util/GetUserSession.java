package com.example.testminiproject.util;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class GetUserSession {

    public static HttpSession getSession(){
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession(false);
    }

    public static String getUserId(){
        return getSession().getAttribute("userId").toString();
    }


}
