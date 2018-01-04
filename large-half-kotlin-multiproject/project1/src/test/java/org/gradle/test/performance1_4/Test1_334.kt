package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_334 {
    private val production = Production1_334("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}