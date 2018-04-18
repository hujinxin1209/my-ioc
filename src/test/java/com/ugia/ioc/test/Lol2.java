package com.ugia.ioc.test;

import com.ugia.ioc.annotation.Autowired;

public class Lol2 {
	@Autowired(value = FaceService.class)
	private FaceService2 faceService;
	
	public void work() {
		faceService.buy("德玛", 5);
	}
	
	public FaceService2 getFaceService() {
		return faceService;
	}
}
