package com.tms.lesson23.hw;

import com.tms.lesson23.hw.web.WebServlet;

public class Runner {
    public static void main(String[] args) {
        WebServlet webApplication = new WebServlet();
        webApplication.run();
    }
}
