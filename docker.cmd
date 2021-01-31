docker pull mysql:5.7
cat tmp.txt | docker login --username chetanchilhate --password-stdin
docker pull chetanchilhate/web-dev:v1
docker loguout

docker-compose -f dc.yaml up
