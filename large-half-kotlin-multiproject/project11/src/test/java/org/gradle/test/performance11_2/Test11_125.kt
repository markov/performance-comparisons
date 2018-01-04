package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_125 {
    private val production = Production11_125("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}