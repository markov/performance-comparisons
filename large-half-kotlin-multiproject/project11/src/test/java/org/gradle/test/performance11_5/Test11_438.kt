package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_438 {
    private val production = Production11_438("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}