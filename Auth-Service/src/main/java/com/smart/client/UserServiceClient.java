package com.smart.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="USER-SERVICE")
public interface UserServiceClient {
  
	
}
