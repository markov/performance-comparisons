package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_267 {
    private val production = Production22_267("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}