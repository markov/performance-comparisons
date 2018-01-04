package org.gradle.test.performance22_2

import org.junit.Assert.*

class Test22_184 {
    private val production = Production22_184("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}