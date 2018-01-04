package org.gradle.test.performance5_3

import org.junit.Assert.*

class Test5_209 {
    private val production = Production5_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}