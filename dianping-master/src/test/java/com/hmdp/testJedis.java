package com.hmdp;


import redis.clients.jedis.Jedis;

public class testJedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.19.243.234", 6379);
        System.out.println(jedis.get("key1"));
    }
}
