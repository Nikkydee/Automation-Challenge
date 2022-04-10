FROM maven:3.8.5-jdk-8-alpine
RUN apk add update \
          bash
COPY pom.xml /app/
COPY src app/src/
COPY amazon.sh /app/
WORKDIR  /app/
ENTRYPOINT ["/bin/sh"]
CMD ["amazon.sh"]