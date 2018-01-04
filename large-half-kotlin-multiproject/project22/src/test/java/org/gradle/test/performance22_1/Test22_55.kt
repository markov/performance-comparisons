package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_55 {
    private val production = Production22_55("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}