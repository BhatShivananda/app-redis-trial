# app-redis-trial

Spring boot application runs with twemproxy - Redis

# twemproxy and redis setup

Get started with twemproxy:

 git clone https://github.com/twitter/twemproxy.git
 cd twemproxy
 autoreconf -fvi
 ./configure --enable-debug=log
 make


Using the following config file located in conf/twem-redis.yml :

beta:
  listen: 127.0.0.1:22122
  hash: fnv1a_64
  hash_tag: "{}"
  distribution: ketama
  auto_eject_hosts: true
  timeout: 400
  redis: true
  servers:
   - 127.0.0.1:6379:1 server1
   - 127.0.0.1:6380:1 server2


Start the 2 Redis servers:

 ./redis-server --port 6379
 ./redis-server --port 6380


Start twemproxy:

./nutcracker -c ../conf/twem-redis.yml -v 11
