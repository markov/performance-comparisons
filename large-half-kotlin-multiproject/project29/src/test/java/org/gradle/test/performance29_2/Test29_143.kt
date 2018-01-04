package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_143 {
    private val production = Production29_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}