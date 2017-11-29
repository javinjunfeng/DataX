package com.alibaba.datax.plugin.writer.hdfswriter;

public enum SupportHiveDataType {
    TINYINT,
    SMALLINT,
    INT,
    BIGINT,
    FLOAT,
    DOUBLE,
    //添加 DECIMAL 格式
    DECIMAL,
    TIMESTAMP,
    DATE,

    STRING,
    VARCHAR,
    CHAR,

    BOOLEAN
}
