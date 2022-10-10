package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
)
// 실습 예제 코드를 살려두기 위해서
// 기존에 작성한 AppConfig 클래스를 제외시키기 위해서 위와 같이 예외필터를 적용시켜준다. (inner-class 포함)
public class AutoAppConfig {
}
