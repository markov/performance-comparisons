package org.gradle.test.performance36_2

import org.junit.Assert.*

class Test36_143 {
    private val production = Production36_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}