FROM java:8-jre-alpine

WORKDIR /home/apps/
ADD target/cloudmusicplayerwebsite-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]