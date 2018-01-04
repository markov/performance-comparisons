package org.gradle.test.performance22_2

import org.junit.Assert.*

class Test22_172 {
    private val production = Production22_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}