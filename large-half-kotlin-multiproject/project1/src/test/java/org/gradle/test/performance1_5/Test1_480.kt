package org.gradle.test.performance1_5

import org.junit.Assert.*

class Test1_480 {
    private val production = Production1_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}