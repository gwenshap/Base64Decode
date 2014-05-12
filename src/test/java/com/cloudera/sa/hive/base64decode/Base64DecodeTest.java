package com.cloudera.sa.hive.base64decode;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.hadoop.io.Text;

/**
 * Created by gshapira on 5/11/14.
 */
public class Base64DecodeTest extends TestCase {
    public void testEvaluate() throws Exception {
        Base64Decode decoder = new Base64Decode();
        Text test = new Text("aGVsbG8sIHdvcmxk");
        Assert.assertEquals(new Text("hello, world"),decoder.evaluate(test));
    }
}
