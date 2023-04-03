package com.ani.spring.excel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ani.spring.util.FileUtil;

@Component
public class XLManager {
    @Autowired
    private XLReader reader;

    @Autowired
    private XLFormatter formatter;

    @Autowired
    private FileUtil util;
    
    @Autowired
    @Qualifier("utilData")
    private FileUtil utilAbc;
    

    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
        util.fileSize();
        utilAbc.fileSize();
    }
}
