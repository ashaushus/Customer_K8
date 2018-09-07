#!/usr/bin/env bash

java -jar -Dspring.profiles.active=${SPRING_PROFILE} -Djava.security.egd=file:/dev/./urandom app.jar