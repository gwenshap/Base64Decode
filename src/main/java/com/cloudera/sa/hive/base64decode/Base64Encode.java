package com.cloudera.sa.hive.base64decode;

import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by gshapira on 5/11/14.
 */
public class Base64Encode extends UDF {

    public Text evaluate(Text value) throws HiveException {
        if (value == null)
            return null;
        else {
            byte[] bytes = value.copyBytes();
            return new Text(Base64.encodeBase64URLSafeString(bytes));

        }
    }
}