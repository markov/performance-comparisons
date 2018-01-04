package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_380 {
    private val production = Production1_380("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}