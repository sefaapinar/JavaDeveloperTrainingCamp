package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//ctrl + shift + o = kullanılmayan importları temizler ve kaydeder.

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	
	
	@Id //veritabanında primary key olduğunu belli eder.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // veri tabanından ID'si otomatik arttırmaya yarar.
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	

}
