package pl.codecouple.domain;


import org.springframework.data.annotation.Id;

/**
 * Created by krzysztof.chrusciel on 2016-06-23.
 */

public class Book {

    @Id
    private String id;

    private String topic;

    public Book() {
    }

    public Book(String topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }
}
