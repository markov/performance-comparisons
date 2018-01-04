package org.gradle.test.performance1_5

import org.junit.Assert.*

class Test1_425 {
    private val production = Production1_425("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}