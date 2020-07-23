package service;

import domain.Champion;
import repository.MockRepository;

import java.util.List;

public class MockService {
    private final MockRepository mockRepository;

    public MockService(MockRepository mockRepository) {
        this.mockRepository = mockRepository;
    }
    //챔피언 모두 찾기
    public List<Champion> findAllChampions() {
        return mockRepository.findAll();
    }
    //챔피언 이름으로 찾기
    public Champion findByName(String name) {
        Champion champion = mockRepository.findByName(name);
        return champion;
    }
    // 포지션 변경
    public Champion updatePositionByName(String name, String position) {
        Champion champion = findByName(name);
        champion.setName(position);

        return champion;
    }
    //챔피언 추가
    public void addChampion(Champion champion){
        Champion addChampion = new Champion(champion.getName(), champion.getPosition(), champion.getHasSkinCount());
        mockRepository.addChampion(addChampion);
        return;
    }
}
