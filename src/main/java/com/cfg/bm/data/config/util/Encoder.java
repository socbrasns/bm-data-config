package com.cfg.bm.data.config.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encoder {

	public static void main(String[] args) {

		System.out.println(new BCryptPasswordEncoder().encode("user"));
	}

}
