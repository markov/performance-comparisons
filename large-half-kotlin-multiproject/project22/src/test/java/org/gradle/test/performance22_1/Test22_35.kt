package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_35 {
    private val production = Production22_35("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}