package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_143 {
    private val production = Production19_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}