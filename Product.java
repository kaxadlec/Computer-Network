package HW;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Product 클래스 선언
public class Product {
        private int no;
        private String name;
        private int price;
        private int stock;
}
