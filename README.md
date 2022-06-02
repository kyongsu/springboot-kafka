## Springoot + Kafka Sample
- Springboot 2.7.0
- JDK 11
- Gradle
- bitnami/Kafka 3.2
- zookeeper 3.8

## docker kafka cli

```bash
$ docker pull bitnami/kafka:latest
$ curl -sSL https://raw.githubusercontent.com/bitnami/bitnami-docker-kafka/master/docker-compose.yml > docker-compose.yml
$ docker-compose up -d # kafka start
$ docker container ls
$ docker-compose stop # kafka stop


$ docker-compose up -d
$ docker exec -it 339b6 /bin/bash
$ cd /bin
$ kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
$ kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

$ kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092 # 얘를 치면 서버 접속해서 '>' 만 뜨게 되어 있다. 당황하지 말고 추가할 이벤트 추가해보자.
> This is my first event
> This is my second event

$ kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092  # 얘를 치면 위에서 서버에 접속 해서 보낸 event를 확인할 수 있다. 
This is my first event
This is my second event


$ kafka-console-consumer.sh --topic kafka-demo --from-beginning --bootstrap-server localhost:9092
```