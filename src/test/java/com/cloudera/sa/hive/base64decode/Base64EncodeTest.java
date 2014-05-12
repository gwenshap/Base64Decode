package com.cloudera.sa.hive.base64decode;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.hadoop.io.Text;

/**
 * Created by gshapira on 5/12/14.
 */
public class Base64EncodeTest extends TestCase {
    public void testEvaluate() throws Exception {
        Base64Encode encoder = new Base64Encode();
        Text test = new Text("hello, world");
        Assert.assertEquals(new Text("aGVsbG8sIHdvcmxk"), encoder.evaluate(test));

    }
}
