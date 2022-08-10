#!/bin/bash

CURRENT_DIR="$( cd "$( dirname "$0" )" && pwd )"
cd $CURRENT_DIR/../build/libs

BEAN_NAME=$1

export AWS_PROFILE=sandbox

java -jar -Xmx2g -Xms2g -server ./dynamodb-example-1.0-SNAPSHOT.jar ${BEAN_NAME} 2>&1
