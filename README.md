Usage instructions
==================

*In Hive CLI or Beeline:*

hive> add jar /mnt/hgfs/shared/Base64Decode-1.0-SNAPSHOT.jar; 

hive> create temporary function base64decode as 'com.cloudera.sa.hive.base64decode.Base64Decode';

hive> create temporary function base64encode as 'com.cloudera.sa.hive.base64decode.Base64Encode';

hive> select base64encode(user_name) from flat_tweets limit 5;

hive> select base64decode(base64encode(user_name)) from flat_tweets limit 5;