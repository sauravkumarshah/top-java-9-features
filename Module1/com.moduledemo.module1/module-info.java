open module com.moduledemo.module1 {
	exports com.moduledemo.package1;
	
	exports com.moduledemo.IRepository;
	provides com.moduledemo.IRepository.IHello with com.moduledemo.IRepository.HelloImpl;
	
	exports com.moduledemo.package1.privateMethod ;//to com.moduledemo.module2;
//	opens com.moduledemo.package1.privateMethod to com.moduledemo.module2, com.moduledemo.module3;
	
	
	
}