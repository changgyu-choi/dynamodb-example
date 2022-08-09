#!/bin/bash

CURRENT_DIR="$( cd "$( dirname "$0" )" && pwd )"
cd $CURRENT_DIR/../build/libs

active_profile=$1
BEAN_NAME=$2

java -jar -Xmx2g -Xms2g -server -Dspring.profiles.active=$active_profile  \
    ./dynamodb-example-1.0-SNAPSHOT.jar ${BEAN_NAME} 2>&1
