package vn.iotstar.model;

import java.io.Serializable;
import java.util.List;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;

	@NotEmpty(message = "Không được phép rỗng")
	private String name;

	private String images;

	private int status;
	
	private Boolean isEdit = false;
	
}
