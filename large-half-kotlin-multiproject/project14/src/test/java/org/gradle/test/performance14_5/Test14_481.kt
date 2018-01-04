package org.gradle.test.performance14_5

import org.junit.Assert.*

class Test14_481 {
    private val production = Production14_481("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}