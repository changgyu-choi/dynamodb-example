#!/bin/bash

aws ssm start-session --target i-0222bffb4d92db06e \
--document-name AWS-StartPortForwardingSessionToRemoteHost \
--parameters '{"portNumber":["3306"],"localPortNumber":["3306"],"host":["database-2.cluster-cvhx7lz6ywsu.ap-northeast-2.rds.amazonaws.com"]}'
