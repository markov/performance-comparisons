package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_263 {
    private val production = Production22_263("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}