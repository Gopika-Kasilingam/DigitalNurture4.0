package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// Test suite class
@Suite
@SelectClasses({EvenCheckerTest.class, OddCheckerTest.class})
public class AllTests {
    // No code needed inside, just annotations
}
