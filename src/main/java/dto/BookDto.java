package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BookDto {
    private Integer id;
    private String title;
    private Long isbn;
    private Integer pagesNumber;
    private String categoryCode;
    private String publisherId;


    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                ", pagesNumber='" + pagesNumber + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", publisherId='" + publisherId + '\'' +
                '}';
    }
}
