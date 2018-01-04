package org.gradle.test.performance20_3

import org.junit.Assert.*

class Test20_209 {
    private val production = Production20_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}