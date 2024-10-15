package ru.pepsxx.spring.help.v003_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBeanPrototype {
}
