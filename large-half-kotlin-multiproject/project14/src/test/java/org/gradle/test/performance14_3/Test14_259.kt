package org.gradle.test.performance14_3

import org.junit.Assert.*

class Test14_259 {
    private val production = Production14_259("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}