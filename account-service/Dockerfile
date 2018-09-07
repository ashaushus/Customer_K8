FROM openjdk:alpine
RUN apk add --no-cache bash
ARG profile
ENV SPRING_PROFILE ${profile}

COPY scripts/docker-entrypoint.sh entrypoint.sh
COPY target/account-service.jar app.jar

EXPOSE 2222

ENTRYPOINT ["./entrypoint.sh"]
