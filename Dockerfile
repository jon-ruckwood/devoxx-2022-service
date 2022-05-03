FROM gcr.io/distroless/java17-debian11
COPY target/hello-world.jar /app/hello-world.jar
CMD ["/app/hello-world.jar"]
