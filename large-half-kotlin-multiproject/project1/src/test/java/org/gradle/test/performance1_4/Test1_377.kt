package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_377 {
    private val production = Production1_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}