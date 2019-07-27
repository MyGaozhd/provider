package com.servi.cloud.provider.redis;

/**
 * cache 接口
 */
public interface ICache {

    public <T> void add(String key, T value);

    public <T> T get(String key);
}
