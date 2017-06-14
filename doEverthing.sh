#!/bin/bash -x

gradle clean test bootRepackage
java -jar build/libs/loop-service-0.1.0.jar