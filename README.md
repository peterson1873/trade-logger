Development

$ mvn clean install
$ docker-compose up --build
$ docker-compose down

Production

$ mvn clean install

# Build produces a container id
$ docker build . 

# Use the container id to run
$ docker run -p 80:8080 <id> 

# Building and running with a tag
docker build -t peterson1873/stock-logger .
docker run -p 80:8080 peterson1873/stock-logger

