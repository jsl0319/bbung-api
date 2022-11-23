package com.bbung.api.test.service;

import com.bbung.api.test.dto.TestDto;
import com.bbung.api.test.entity.TestEntity;
import com.bbung.api.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final TestRepository testRepository;
    public TestDto testServiceMethod(String str) {
        log.info("### testServiceMethod : {}", Integer.parseInt(str));

        Optional<TestEntity> entity = testRepository.findById(Integer.parseInt(str));
        log.info("### entity : {}", entity);

        TestDto testDto = new TestDto();
        testDto.builder().
                testId(entity.get().getTestId())
                .build();

        return testDto;
    }
}
