/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.instaclustr.jfleming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library classUnderTest;

    public LibraryTest(){
        classUnderTest = new Library();
    }

    @Test
    void someLibraryMethodReturnsTrue() {
        classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void stringCompareReturnsTrueForEmptyString(){
        classUnderTest = new Library();
        assertTrue(classUnderTest.isStringEmptyOrNull(""));
    }

    @Test
    void stringCompareReturnsTrueForNull(){
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.isStringEmptyOrNull(null));
    }
}
