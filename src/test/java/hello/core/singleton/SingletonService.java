package hello.core.singleton;

import lombok.Getter;

public class SingletonService {


    //2. public으로 열어서 객체 인스턴스가 static 메서드를 통해서만 조회되도록
    //1. static 영역에 객체를 딱 1개만 생성해둠
    @Getter
    private static final SingletonService instance = new SingletonService();

    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
