package vn.iotstar.entity;

import java.io.Serializable;
import java.util.List;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "categories")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryId")
	private Long categoryId;

	@Column(name = "Categoryname", columnDefinition = "NVARCHAR(200)")
	@NotEmpty(message = "Không được phép rỗng")
	private String name;

	@Column(name = "Images", columnDefinition = "NVARCHAR(MAX) NULL")
	private String images;

	private int status;
}
