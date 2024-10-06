# Use OpenJDK 11 as the base image
FROM maven:latest

# Copy the compiled application JAR (update the path if needed)
COPY target/sports-time-tracker.jar /usr/src/sports-time-tracker.jar

# Set the working directory
WORKDIR /usr/src

# Run the application
CMD ["java", "-jar", "sports-time-tracker.jar"]

