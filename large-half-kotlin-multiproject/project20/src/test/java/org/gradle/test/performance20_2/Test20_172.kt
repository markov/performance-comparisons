package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_172 {
    private val production = Production20_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}