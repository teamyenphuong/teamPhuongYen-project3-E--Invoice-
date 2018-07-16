package com.dxc.projectInvoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/*@SpringBootApplication giúp bạn tự động cấu hình Spring, và tự động quét (Scan) toàn bộ project
để tìm ra các thành phần Spring (Controller, Bean, Service,...)*/


@SpringBootApplication
public class Invoice20180716Application {

	public static void main(String[] args) {
		SpringApplication.run(Invoice20180716Application.class, args);
	}
}
