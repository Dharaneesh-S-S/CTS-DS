package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({

        CalculatorTest.class,

        CalculatorExceptionTest.class,

        CalculatorTimeoutTest.class,

        CalculatorParameterizedTest.class

})
public class AllTestsSuite {

}