package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_298 {
    private val production = Production11_298("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}