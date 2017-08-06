# Cài đặt ngôn ngữ và công cụ lập trình Java trên hệ điều hành Ubuntu 16.04

* **Thực hiện:** Thi Minh Nhựt - **Email:** thiminhnhut@gmail.com

* **Thời gian:** Ngày 07 tháng 08 năm 2017

## Tài liệu tham khảo

* [Hướng dẫn cài đặt Java trên Ubuntu 16.04](http://www.codehub.vn/Huong-dan-cai-dat-Java-tren-Ubuntu-16-04)

## Nội dung hướng dẫn

### Cài đặt JDK trên Ubuntu 16.04

* Cập nhật lại danh sách các `package index` trên hệ điều hành:

	```bash	
	$ sudo apt-get update
	```

* Cài đặt JDK (phiên bản mặc định dành cho Ubuntu):

	```bash
	$ sudo apt-get install default-jdk
	```
	Với cách cài đặt này `JDK` (Java Development Kit) đã bao gồm cả 
	`JRE` (Java Runtime Environment).
	
* Thiết lập biến môi trường `JAVA_HOME`:

	+ Sau khi cài đặt chúng ta cần thiết lập biến môi trường của Java trên máy tính.
	
	+ Biến môi trường của Java được sử dụng bởi các chương trình chạy bằng Java
	và có tên là `JAVA_HOME`.
	
	+ Giá trị của biến `JAVA_HOME` trỏ tới thư mục cài đặt của Java trên hệ điều hành.
	
	+ Tìm địa chỉ của thư mục cài đặt `java` với lệnh:
	
		```bash		
		$ sudo update-alternatives --config java
		
		There is only one alternative in link group java (providing /usr/bin/java): /usr/lib/jvm/java-8-openjdk-i386/jre/bin/java		
		Nothing to configure.		
		```
		Ta được địa chỉ `/usr/lib/jvm/java-8-openjdk-i386/jre/bin/java`.
		
	+ Gán giá trị cho biến `JAVA_HOME`:
		
		- Thêm biến `JAVA_HOME` vào file `/etc/environment`:
	
			```bash
			$ sudo nano /etc/environment		
			```
		
		- Thêm vào nội dung: `JAVA_HOME="/usr/lib/jvm/java-8-openjdk-i386/jre/bin/java"`
		
		- Nhấn `Ctrl + X + Y` để lưu lại và thoát.
	
	+ Cập nhật lại các thay đổi mà không cần khởi động lại Terminal:
	
		```bash		
		$ source /etc/environment		
		```
		
	+ Xem lại biến môi trường `JAVA_HOME` được cài đặt:
	
		```bash		
		$ echo $JAVA_HOME
				
		/usr/lib/jvm/java-8-openjdk-i386/jre/bin/java		
		```
		
		Nếu được kết quả tương tự như vậy thì quá trình cài đặt biến môi trường `JAVA_HOME`
		được thực hiện thành công.

### Cài đặt công cụ lập trình Eclipse trên Ubuntu 16.04

* Vào `Ubuntu Software` nhập vào từ khóa `Eclipse`, sau đó chọn và cài đặt `Eclipse`.
