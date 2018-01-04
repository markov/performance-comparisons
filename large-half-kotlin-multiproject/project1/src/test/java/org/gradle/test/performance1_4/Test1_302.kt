package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_302 {
    private val production = Production1_302("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}