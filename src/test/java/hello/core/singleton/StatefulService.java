package hello.core.singleton;

import lombok.Getter;

@Getter
public class StatefulService {

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

}
