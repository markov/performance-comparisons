package org.gradle.test.performance22_2

import org.junit.Assert.*

class Test22_108 {
    private val production = Production22_108("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}