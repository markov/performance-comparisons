package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_66 {
    private val production = Production22_66("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}