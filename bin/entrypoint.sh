#!/bin/sh

JAVA_OPTS="${JAVA_OPTS} -Dserver.port=${SERVER_PORT}"
JAVA_OPTS="${JAVA_OPTS} -Dspring.application.name=${APPLICATION_NAME}"
JAVA_OPTS="${JAVA_OPTS} -Dspring.profiles.active=${PROFILES_ACTIVE}"
JAVA_OPTS="${JAVA_OPTS} -Dspring.cloud.nacos.discovery.server-addr=${NACOS_DISCOVERY_SERVER}"
JAVA_OPTS="${JAVA_OPTS} -Dspring.cloud.nacos.config.server-addr=${NACOS_CONFIG_SERVER}"
JAVA_OPTS="${JAVA_OPTS} -Dspring.cloud.nacos.config.groupId=${NACOS_CONFIG_GROUPID}"
JAVA_OPTS="${JAVA_OPTS} -Dspring.cloud.nacos.config.dateId=${NACOS_CONFIG_DATAID}"

exec java ${JAVA_OPTS} org.springframework.boot.loader.JarLauncher $@