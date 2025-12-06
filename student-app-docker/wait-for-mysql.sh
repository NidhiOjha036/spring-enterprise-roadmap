#!/bin/sh
set -e
host="mysql"
port=3306

echo "Waiting for MySQL at $host:$port..."
until nc -z $host $port; do
  echo "MySQL is not ready yet. Waiting..."
  sleep 2
done

echo "MySQL is up! Starting Spring Boot app..."
exec java -jar /student-app.jar
