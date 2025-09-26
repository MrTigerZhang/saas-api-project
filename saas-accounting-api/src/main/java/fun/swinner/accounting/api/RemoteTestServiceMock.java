package fun.swinner.accounting.api;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoteTestServiceMock implements RemoteTestService {
    @Override
    public String test(String arg) {
        log.warn("服务降级");
        return null;
    }
}
