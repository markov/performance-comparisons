package org.gradle.test.performance22_1

import org.junit.Assert.*

class Test22_100 {
    private val production = Production22_100("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}