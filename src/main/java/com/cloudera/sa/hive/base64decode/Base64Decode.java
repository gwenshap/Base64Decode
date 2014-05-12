package com.cloudera.sa.hive.base64decode;

import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by gshapira on 5/11/14.
 */
public class Base64Decode extends UDF {

    public Text evaluate(Text value) throws HiveException, UnsupportedEncodingException {
        if (value == null)
            return null;
        else {
            byte[] decoded = Base64.decodeBase64(value.toString());
            return new Text(decoded);
        }
    }
}