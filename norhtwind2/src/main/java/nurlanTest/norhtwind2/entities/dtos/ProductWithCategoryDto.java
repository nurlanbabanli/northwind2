package nurlanTest.norhtwind2.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {

	private int id;
	private String productName;
	private String categoryName;
}
