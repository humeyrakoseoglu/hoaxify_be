package com.hoaxify.webService.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //sınıf için getter, setter, equals, hashCode ve toString gibi temel yöntemleri otomatik olarak oluşturur
@Entity //Java sınıfının bir JPA varlığı olduğunu belirtir. Bu sayede sınıf, veritabanında bir tabloya karşılık gelecektir.
@Table(name="users") //Bu anotasyon, veritabanında oluşturulacak tablonun adını belirtir. "users" adında bir tablo oluşturulacak.
public class User {

	@Id //Bu anotasyon, sınıfın birincil anahtar (primary key) alanını belirtir. Veritabanında her bir satırı benzersiz şekilde tanımlamak için kullanılır.
	@GeneratedValue //Bu anotasyon, birincil anahtarın otomatik olarak oluşturulacağını belirtir. Yani, veritabanı otomatik olarak bir değer atayacak.
	private long id;

	private String userName;

	private String fullName;

	private String password;

}