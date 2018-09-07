FROM openjdk:alpine
RUN apk add --no-cache bash
ARG profile
ENV SPRING_PROFILE ${profile}

COPY scripts/docker-entrypoint.sh entrypoint.sh
COPY target/customer-service.jar app.jar

EXPOSE 3333

ENTRYPOINT ["./entrypoint.sh"]