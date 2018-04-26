#!/usr/bin/env bash
./mvnw spring-boot:run -Drun.jvmArguments="-Dencrypt.keyStore.secret=my-k34-s3cr3t -Dencrypt.keyStore.password=my-s70r3-s3cr3t -Dserver.port=8081"